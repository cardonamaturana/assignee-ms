package com.cardonamaturana.assigneems.infrastructure.api.controller;

import com.cardonamaturana.assigneems.application.assignee.AssigneeSaveApplication;
import com.cardonamaturana.assigneems.application.assignee.AssigneeUpdateApplication;
import com.cardonamaturana.assigneems.application.employee.EmployeeGetAllApplication;
import com.cardonamaturana.assigneems.application.employee.EmployeeGetAllByCompanyIdApplication;
import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeUpdateRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.assignee.AssigneeResponse;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.employee.EmployeeResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.assignee.AssigneeResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.employee.EmployeeRequestMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.employee.EmployeeResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.employee.EmployeeUpdateRequestMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
public class EmployeeController {

  private final AssigneeSaveApplication assigneeSaveApplication;
  private final EmployeeGetAllApplication employeeGetAllApplication;
  private final EmployeeGetAllByCompanyIdApplication employeeGetAllByCompanyIdApplication;
  private final AssigneeUpdateApplication assigneeUpdateApplication;
  private final EmployeeRequestMapper employeeRequestMapper;
  private final EmployeeUpdateRequestMapper employeeUpdateRequestMapper;
  private final EmployeeResponseMapper employeeResponseMapper;
  private final AssigneeResponseMapper assigneeResponseMapper;

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


  @GetMapping()
  @Operation(summary = "Get all employee", description = "Obtain all register for employee", responses = {
      @ApiResponse(responseCode = "200", description = "obtained successfully"),
      @ApiResponse(responseCode = "500", description = "error in response")})
  @ResponseStatus(HttpStatus.OK)
  public Flux<AssigneeResponse> getAllEmployee() {
    return employeeGetAllApplication.getAll().map(assigneeResponseMapper::toDto);
  }

  @GetMapping("/{companyId}")
  @Operation(summary = "Get employees for company id", description = "Obtain all employees registered by companyId", responses = {
      @ApiResponse(responseCode = "200", description = "obtained successfully"),
      @ApiResponse(responseCode = "500", description = "error in response")})
  @ResponseStatus(HttpStatus.OK)
  public Flux<AssigneeResponse> getAllEmployeesByCompanyId(@PathVariable() String companyId) {
    return employeeGetAllByCompanyIdApplication.getAll(companyId)
        .map(assigneeResponseMapper::toDto);
  }

}
