package com.cardonamaturana.assigneems.infrastructure.api.controller;

import com.cardonamaturana.assigneems.application.assignee.AssigneeGetAllApplication;
import com.cardonamaturana.assigneems.application.assignee.AssigneeGetByEmailApplication;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.assignee.AssigneeResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.assignee.AssigneeResponseMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/assignee")
@RequiredArgsConstructor
public class AssigneeController {


  private final AssigneeGetAllApplication assigneeGetAllApplication;
  private final AssigneeGetByEmailApplication assigneeGetByEmailApplication;
  private final AssigneeResponseMapper assigneeResponseMapper;


  @GetMapping()
  @Operation(summary = "Get all assignees", description = "Obtain all register for assignee", responses = {
      @ApiResponse(responseCode = "200", description = "obtained successfully"),
      @ApiResponse(responseCode = "500", description = "error in response")})
  @ResponseStatus(HttpStatus.OK)
  public Flux<AssigneeResponse> getAllAssignee() {
    return assigneeGetAllApplication.getAll().map(assigneeResponseMapper::toDto);
  }

  @GetMapping("/email")
  @Operation(summary = "Get Assignee for personal email", description = "Obtain one register of assignee for personal email", responses = {
      @ApiResponse(responseCode = "200", description = "obtained successfully"),
      @ApiResponse(responseCode = "500", description = "error in response")})
  @ResponseStatus(HttpStatus.OK)
  public Mono<AssigneeResponse> getAssgigneeByEmail(String assigneeEmail) {
    return assigneeGetByEmailApplication.get(Mono.just(assigneeEmail)).map(assigneeResponseMapper::toDto);
  }

}
