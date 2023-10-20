package com.cardonamaturana.assigneems.application.assignee;

import com.cardonamaturana.assigneems.application.assignee.process.AssigneeProcess;
import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetByEmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssigneeGetByEmailApplication {

  private final AssigneeGetByEmailService assigneeGetByEmailService;
  private final AssigneeProcess assigneeProcess;

  public Mono<Assignee> get(Mono<String> assigneeEmail) {
    return assigneeGetByEmailService.get(assigneeEmail)
        .flatMap(assignee -> assigneeProcess.processForGetAssignee(assignee));
  }

}
