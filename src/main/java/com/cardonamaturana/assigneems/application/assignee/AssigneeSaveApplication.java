package com.cardonamaturana.assigneems.application.assignee;

import com.cardonamaturana.assigneems.application.assignee.process.AssigneeProcess;
import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssigneeSaveApplication {

  private final AssigneeSaveService assigneeSaveService;
  private final AssigneeProcess assigneeProcess;

  public Mono<Assignee> save(Assignee assignee) {
    return assigneeProcess.processForSave(assignee).flatMap(assigneeSaveService::save);
  }

}
