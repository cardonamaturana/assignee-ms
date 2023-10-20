package com.cardonamaturana.assigneems.application.assignee;

import com.cardonamaturana.assigneems.application.assignee.process.AssigneeProcess;
import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssigneeGetByIdApplication {

  private final AssigneeGetByIdService assigneeGetByIdService;
  private final AssigneeProcess assigneeProcess;

  public Mono<Assignee> get(Mono<String> assigneeId) {
    return assigneeGetByIdService.get(assigneeId)
        .flatMap(assignee -> assigneeProcess.processForGetAssignee(assignee));
  }

}
