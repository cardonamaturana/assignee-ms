package com.cardonamaturana.assigneems.application.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssigneeSaveApplication {

  private final AssigneeSaveService assigneeSaveService;

  public Mono<Assignee> save(Assignee assignee) {
    return assigneeSaveService.save(assignee);
  }

}
