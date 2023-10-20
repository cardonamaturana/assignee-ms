package com.cardonamaturana.assigneems.infrastructure.api.controller;

import com.cardonamaturana.assigneems.application.company.CompanyGetAllApplication;
import com.cardonamaturana.assigneems.application.company.CompanySaveApplication;
import com.cardonamaturana.assigneems.application.company.CompanyUpdateApplication;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.company.CompanySaveRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.company.CompanyUpdateRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.company.CompanyResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.company.CompanyResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.company.CompanySaveRequestMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.company.CompanyUpdateRequestMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/company")
@RequiredArgsConstructor
public class CompanyController {

  private final CompanySaveApplication companySaveApplication;
  private final CompanyGetAllApplication companyGetAllApplication;
  private final CompanySaveRequestMapper companySaveRequestMapper;
  private final CompanyUpdateApplication companyUpdateApplication;
  private final CompanyUpdateRequestMapper companyUpdateRequestMapper;
  private final CompanyResponseMapper companyResponseMapper;

  @PostMapping()
  @Operation(summary = "Create Company", description = "Create a new company into database", responses = {
      @ApiResponse(responseCode = "200", description = "create successful"),
      @ApiResponse(responseCode = "400", description = "error in any field of JSON request")})
  public Mono<ResponseEntity<CompanyResponse>> saveCompany(
      @RequestBody CompanySaveRequest companySaveRequest) {
    return companySaveApplication.save(companySaveRequestMapper.toEntity(companySaveRequest))
        .map(saved -> ResponseEntity.status(
            HttpStatus.CREATED).body(companyResponseMapper.toDto(saved)));
  }

  @PutMapping()
  @Operation(summary = "Update Company", description = "Update a existent company into database", responses = {
      @ApiResponse(responseCode = "200", description = "Updated successfully"),
      @ApiResponse(responseCode = "400", description = "Error in any field of JSON request")})
  public Mono<ResponseEntity<CompanyResponse>> updateCompany(
      @RequestBody CompanyUpdateRequest companyUpdateRequest) {
    return companyUpdateApplication.update(
            companyUpdateRequestMapper.toEntity(companyUpdateRequest))
        .map(updated -> ResponseEntity.status(
            HttpStatus.OK).body(companyResponseMapper.toDto(updated)));
  }

  @GetMapping()
  @Operation(summary = "Get all companies", description = "Obtain all register for company", responses = {
      @ApiResponse(responseCode = "200", description = "obtained successfully"),
      @ApiResponse(responseCode = "500", description = "error in response")})
  @ResponseStatus(HttpStatus.OK)
  public Flux<CompanyResponse> getAllCompany() {
    return companyGetAllApplication.getAll().map(companyResponseMapper::toDto);
  }

}
