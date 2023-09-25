package com.cardonamaturana.assigneems.application.assignee;

import com.cardonamaturana.assigneems.application.assignee.process.AssigneeProcess;
import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class AssigneeGetAllApplication {

  private final AssigneeGetAllService assigneeGetAllService;
  private final AssigneeProcess assigneeProcess;

  public Flux<Assignee> getAll() {
    return assigneeGetAllService.getAll()
        .flatMap(result -> assigneeProcess.processForGetAll(result));
  }


  public AssigneeGetAllApplication(@Qualifier("assignee") AssigneeGetAllService assigneeGetAllService,
      AssigneeProcess assigneeProcess) {
    this.assigneeGetAllService = assigneeGetAllService;
    this.assigneeProcess = assigneeProcess;
  }
}
