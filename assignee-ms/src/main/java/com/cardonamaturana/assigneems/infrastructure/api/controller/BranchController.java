package com.cardonamaturana.assigneems.infrastructure.api.controller;

import com.cardonamaturana.assigneems.application.assignee.AssigneeSaveApplication;
import com.cardonamaturana.assigneems.application.assignee.AssigneeUpdateApplication;
import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.branch.BranchRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.branch.BranchUpdateRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.branch.BranchResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.branch.BranchRequestMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.branch.BranchResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.branch.BranchUpdateRequestMapper;
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
@RequestMapping("/branch")
@RequiredArgsConstructor
public class BranchController {

  private final AssigneeSaveApplication assigneeSaveApplication;
  private final AssigneeUpdateApplication assigneeUpdateApplication;
  private final BranchRequestMapper branchRequestMapper;
  private final BranchUpdateRequestMapper branchUpdateRequestMapper;
  private final BranchResponseMapper branchResponseMapper;

  @PostMapping()
  @Operation(summary = "Create Branch", description = "Create a new branch into database", responses = {
      @ApiResponse(responseCode = "200", description = "create successful"),
      @ApiResponse(responseCode = "400", description = "error in any field of JSON request")})
  public Mono<ResponseEntity<BranchResponse>> saveBranch(
      @RequestBody BranchRequest branchRequest) {
    return assigneeSaveApplication.save(branchRequestMapper.toEntity(branchRequest))
        .map(saved -> ResponseEntity.status(
            HttpStatus.CREATED).body(branchResponseMapper.toDto((Branch) saved)));
  }

  @PutMapping()
  @Operation(summary = "Update Branch Responsible", description = "Update a existent branch into database", responses = {
      @ApiResponse(responseCode = "200", description = "Updated successfully"),
      @ApiResponse(responseCode = "400", description = "Error in any field of JSON request")})
  public Mono<ResponseEntity<BranchResponse>> updateBranch(
      @RequestBody BranchUpdateRequest branchUpdateRequest) {
    return assigneeUpdateApplication.update(
            branchUpdateRequestMapper.toEntity(branchUpdateRequest))
        .map(updated -> ResponseEntity.status(
            HttpStatus.OK).body(branchResponseMapper.toDto((Branch) updated)));
  }

}
