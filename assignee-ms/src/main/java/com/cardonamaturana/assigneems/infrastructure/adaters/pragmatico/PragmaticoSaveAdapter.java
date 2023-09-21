package com.cardonamaturana.assigneems.infrastructure.adaters.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.domain.service.pragmatico.PragmaticoSaveService;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeRepository;
import com.cardonamaturana.assigneems.infrastructure.repository.pragmatico.PragmaticoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class PragmaticoSaveAdapter implements PragmaticoSaveService {

  private final AssigneeRepository assigneeRepository;
  private final PragmaticoMapper pragmaticoMapper;

  @Override
  public Mono<Pragmatico> save(Pragmatico pragmatico) {
    return assigneeRepository.save(pragmaticoMapper.toDto(pragmatico))
        .map(pragmaticoMapper::toEntity);
  }
}
