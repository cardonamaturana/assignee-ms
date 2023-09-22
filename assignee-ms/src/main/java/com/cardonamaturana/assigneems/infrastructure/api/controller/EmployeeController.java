package com.cardonamaturana.assigneems.infrastructure.api.controller;

import com.cardonamaturana.assigneems.application.assignee.AssigneeSaveApplication;
import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.employee.EmployeeResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.employee.EmployeeRequestMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.employee.EmployeeResponseMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

  private final AssigneeSaveApplication assigneeSaveApplication;
  private final EmployeeRequestMapper employeeRequestMapper;
  private final EmployeeResponseMapper employeeResponseMapper;

  @PostMapping()
  @Operation(summary = "Create employee", description = "Create a new employee into database", responses = {
      @ApiResponse(responseCode = "200", description = "create successful"),
      @ApiResponse(responseCode = "400", description = "error in any field of JSON request")})
  public Mono<ResponseEntity<EmployeeResponse>> saveEmployee(
      @RequestBody EmployeeRequest employeeRequest) {
    return assigneeSaveApplication.save(employeeRequestMapper.toEntity(employeeRequest))
        .map(saved -> ResponseEntity.status(
            HttpStatus.CREATED).body(employeeResponseMapper.toDto((Employee) saved)));
  }

}
