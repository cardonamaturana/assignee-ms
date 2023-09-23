package com.cardonamaturana.assigneems.infrastructure.api.controller;

import com.cardonamaturana.assigneems.application.assignee.AssigneeSaveApplication;
import com.cardonamaturana.assigneems.application.assignee.AssigneeUpdateApplication;
import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeUpdateRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.employee.EmployeeResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.employee.EmployeeRequestMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.employee.EmployeeResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.employee.EmployeeUpdateRequestMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

  private final AssigneeSaveApplication assigneeSaveApplication;
  private final AssigneeUpdateApplication assigneeUpdateApplication;
  private final EmployeeRequestMapper employeeRequestMapper;
  private final EmployeeUpdateRequestMapper employeeUpdateRequestMapper;
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

  @PutMapping()
  @Operation(summary = "Update Employee Responsible", description = "Update a existent employee into database", responses = {
      @ApiResponse(responseCode = "200", description = "Updated successfully"),
      @ApiResponse(responseCode = "400", description = "Error in any field of JSON request")})
  public Mono<ResponseEntity<EmployeeResponse>> updateEmployee(
      @RequestBody EmployeeUpdateRequest employeeUpdateRequest) {
    return assigneeUpdateApplication.update(
            employeeUpdateRequestMapper.toEntity(employeeUpdateRequest))
        .map(updated -> ResponseEntity.status(
            HttpStatus.OK).body(employeeResponseMapper.toDto((Employee) updated)));
  }

}
