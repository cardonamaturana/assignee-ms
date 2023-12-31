package com.cardonamaturana.assigneems.infrastructure.api.controller;

import com.cardonamaturana.assigneems.application.assignee.AssigneeSaveApplication;
import com.cardonamaturana.assigneems.application.assignee.AssigneeUpdateApplication;
import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoSaveRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoUpdateRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.pragmatico.PragmaticoResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico.PragmaticoRequestMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico.PragmaticoResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico.PragmaticoUpdateRequestMapper;
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
@RequestMapping("/pragmatico")
@RequiredArgsConstructor
public class PragmaticoController {

  private final AssigneeSaveApplication assigneeSaveApplication;
  private final AssigneeUpdateApplication assigneeUpdateApplication;
  private final PragmaticoRequestMapper pragmaticoRequestMapper;
  private final PragmaticoUpdateRequestMapper pragmaticoUpdateRequestMapper;
  private final PragmaticoResponseMapper pragmaticoResponseMapper;

  @PostMapping()
  @Operation(summary = "Create Pragmatic Responsible", description = "Create a new pragmatic into database", responses = {
      @ApiResponse(responseCode = "201", description = "Created successfully"),
      @ApiResponse(responseCode = "400", description = "Error in any field of JSON request")})
  public Mono<ResponseEntity<PragmaticoResponse>> savePragmatico(
      @RequestBody PragmaticoSaveRequest pragmaticoSaveRequest) {
    return assigneeSaveApplication.save(pragmaticoRequestMapper.toEntity(pragmaticoSaveRequest))
        .map(saved -> ResponseEntity.status(
            HttpStatus.CREATED).body(pragmaticoResponseMapper.toDto((Pragmatico) saved)));
  }


  @PutMapping()
  @Operation(summary = "Update Pragmatic Responsible", description = "Update a existent pragmatic into database", responses = {
      @ApiResponse(responseCode = "200", description = "Updated successfully"),
      @ApiResponse(responseCode = "400", description = "Error in any field of JSON request")})
  public Mono<ResponseEntity<PragmaticoResponse>> updatePragmatico(
      @RequestBody PragmaticoUpdateRequest pragmaticoUpdateRequest) {
    return assigneeUpdateApplication.update(
            pragmaticoUpdateRequestMapper.toEntity(pragmaticoUpdateRequest))
        .map(updated -> ResponseEntity.status(
            HttpStatus.OK).body(pragmaticoResponseMapper.toDto((Pragmatico) updated)));
  }

}
