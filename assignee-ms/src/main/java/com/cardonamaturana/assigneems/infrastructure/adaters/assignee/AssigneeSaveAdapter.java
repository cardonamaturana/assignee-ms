package com.cardonamaturana.assigneems.infrastructure.adaters.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class AssigneeSaveAdapter implements AssigneeSaveService {


  @Override
  public Mono<Assignee> save(Assignee assignee) {
    return null;
  }
}
