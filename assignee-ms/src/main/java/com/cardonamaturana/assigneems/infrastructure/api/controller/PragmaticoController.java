package com.cardonamaturana.assigneems.infrastructure.api.controller;

import com.cardonamaturana.assigneems.application.pragmatico.PragmaticoSaveApplication;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoRequest;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.pragmatico.PragmaticoResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.PragmaticoRequestMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.PragmaticoResponseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/pragmatico")
@RequiredArgsConstructor
public class PragmaticoController {

  private final PragmaticoSaveApplication pragmaticoSaveApplication;
  private final PragmaticoRequestMapper pragmaticoRequestMapper;
  private final PragmaticoResponseMapper pragmaticoResponseMapper;

  @PostMapping()
  public Mono<ResponseEntity<PragmaticoResponse>> savePragmatico(
      @RequestBody PragmaticoRequest pragmaticoRequest) {
    return pragmaticoSaveApplication.save(pragmaticoRequestMapper.toEntity(pragmaticoRequest))
        .map(saved -> ResponseEntity.status(
            HttpStatus.CREATED).body(pragmaticoResponseMapper.toDto(saved)));
  }

}
