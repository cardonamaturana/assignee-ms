package com.cardonamaturana.assigneems.application.assignee;

import com.cardonamaturana.assigneems.application.assignee.process.AssigneeProcess;
import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssigneeUpdateApplication {

  private final AssigneeSaveService assigneeSaveService;
  private final AssigneeProcess assigneeProcess;

  public Mono<Assignee> update(Assignee assignee) {
    return assigneeProcess.processForUpdate(assignee)
        .flatMap(processed -> assigneeSaveService.save(processed));
  }

}
