package com.cardonamaturana.assigneems.infrastructure.api.controller;

import com.cardonamaturana.assigneems.application.branch.BranchSaveApplication;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.branch.BranchRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.branch.BranchResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.branch.BranchRequestMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.branch.BranchResponseMapper;
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
@RequestMapping("/branch")
@RequiredArgsConstructor
public class BranchController {

  private final BranchSaveApplication branchSaveApplication;
  private final BranchRequestMapper branchRequestMapper;
  private final BranchResponseMapper branchResponseMapper;

  @PostMapping()
  @Operation(summary = "Create Branch", description = "Create a new branch into database", responses = {
      @ApiResponse(responseCode = "200", description = "create successful"),
      @ApiResponse(responseCode = "400", description = "error in any field of JSON request")})
  public Mono<ResponseEntity<BranchResponse>> saveBranch(
      @RequestBody BranchRequest branchRequest) {
    return branchSaveApplication.save(branchRequestMapper.toEntity(branchRequest))
        .map(saved -> ResponseEntity.status(
            HttpStatus.CREATED).body(branchResponseMapper.toDto(saved)));
  }

}
