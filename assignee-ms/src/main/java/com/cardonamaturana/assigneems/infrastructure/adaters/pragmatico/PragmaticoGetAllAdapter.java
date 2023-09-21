package com.cardonamaturana.assigneems.infrastructure.adaters.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.domain.service.pragmatico.PragmaticoGetAllService;
import com.cardonamaturana.assigneems.infrastructure.repository.pragmatico.PragmaticoMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.pragmatico.PragmaticoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
@RequiredArgsConstructor
public class PragmaticoGetAllAdapter implements PragmaticoGetAllService {

  private final PragmaticoRepository pragmaticoRepository;
  private final PragmaticoMapper pragmaticoMapper;

  @Override
  public Flux<Pragmatico> getAll() {
    return pragmaticoRepository.findAll().map(pragmaticoMapper::toEntity);
  }
}
