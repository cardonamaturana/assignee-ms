package com.cardonamaturana.assigneems.infrastructure.adaters.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.domain.service.pragmatico.PragmaticoSaveService;
import com.cardonamaturana.assigneems.infrastructure.repository.pragmatico.PragmaticoMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.pragmatico.PragmaticoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class PragmaticoSaveAdapter implements PragmaticoSaveService {

  private final PragmaticoRepository pragmaticoRepository;
  private final PragmaticoMapper pragmaticoMapper;

  @Override
  public Mono<Pragmatico> save(Pragmatico pragmatico) {
    return pragmaticoRepository.save(pragmaticoMapper.toDto(pragmatico))
        .map(pragmaticoMapper::toEntity);
  }
}
