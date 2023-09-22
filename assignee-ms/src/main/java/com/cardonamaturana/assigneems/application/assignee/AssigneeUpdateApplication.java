package com.cardonamaturana.assigneems.application.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeSaveService;
import com.cardonamaturana.assigneems.infrastructure.adaters.assignee.process.AssigneeProcess;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssigneeUpdateApplication {

  private final AssigneeSaveService assigneeSaveService;
  private final AssigneeProcess assigneeProcess;

  public Mono<Assignee> update(Assignee assignee) {
    return assigneeProcess.validateForUpdate(assignee.getId())
        .then(assigneeSaveService.save(assignee));
  }

}
