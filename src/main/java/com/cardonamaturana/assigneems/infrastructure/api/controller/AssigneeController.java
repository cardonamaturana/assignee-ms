package com.cardonamaturana.assigneems.infrastructure.api.controller;

import static com.cardonamaturana.assigneems.shared.utils.CustomHeaders.X_OBJECT_TYPE;

import com.cardonamaturana.assigneems.application.assignee.AssigneeDeleteByIdApplication;
import com.cardonamaturana.assigneems.application.assignee.AssigneeGetAllApplication;
import com.cardonamaturana.assigneems.application.assignee.AssigneeGetByEmailApplication;
import com.cardonamaturana.assigneems.application.assignee.AssigneeGetByIdApplication;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.assignee.AssigneeResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.assignee.AssigneeResponseMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
  private final AssigneeGetByIdApplication assigneeGetByIdApplication;
  private final AssigneeDeleteByIdApplication assigneeDeleteByIdApplication;
  private final AssigneeResponseMapper assigneeResponseMapper;


  @GetMapping()
  @Operation(summary = "Get all assignees", description = "Obtain all register for assignee", responses = {
      @ApiResponse(responseCode = "200", description = "obtained successfully"),
      @ApiResponse(responseCode = "500", description = "error in response")})
  @ResponseStatus(HttpStatus.OK)
  public Flux<AssigneeResponse> getAllAssignee() {
    return assigneeGetAllApplication.getAll().map(assigneeResponseMapper::toDto);
  }

  @GetMapping("/{email}")
  @Operation(summary = "Get Assignee for personal email", description = "Obtain one register of assignee for personal email", responses = {
      @ApiResponse(responseCode = "200", description = "obtained successfully"),
      @ApiResponse(responseCode = "500", description = "error in response")})
  @ResponseStatus(HttpStatus.OK)
  public Mono<AssigneeResponse> getAssigneeByEmail(@RequestParam("email") String assigneeEmail) {
    return assigneeGetByEmailApplication.get(Mono.just(assigneeEmail))
        .map(assigneeResponseMapper::toDto);
  }

  @GetMapping("/id")
  @Operation(summary = "Get Assignee for id ", description = "Obtain one register of assignee for id", responses = {
      @ApiResponse(responseCode = "200", description = "obtained successfully"),
      @ApiResponse(responseCode = "500", description = "error in response")})
  @ResponseStatus(HttpStatus.OK)
  public Mono<ResponseEntity<AssigneeResponse>> getAssigneeById(
      @RequestParam("assigneeId") String assigneId) {
    HttpHeaders headers = new HttpHeaders();
    String headerValue = "";
    return assigneeGetByIdApplication.get(Mono.just(assigneId))
        .map(assigneeResponseMapper::toDto)
        .doOnNext(result -> headers.set(X_OBJECT_TYPE.getMessage(), result.getClass().getSimpleName()))
        .map(result -> ResponseEntity.ok().headers(headers).body(result));
  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Delete Assignee for identifier", description = "Delete one register of assignee for identificator", responses = {
      @ApiResponse(responseCode = "204", description = "Deleted successfully"),
      @ApiResponse(responseCode = "500", description = "error in request")})
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public Mono<Void> deleteById(String assigneId) {
    return assigneeDeleteByIdApplication.delete(Mono.just(assigneId));
  }


}
