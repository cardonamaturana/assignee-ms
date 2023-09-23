package com.cardonamaturana.assigneems.application.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class AssigneeGetAllApplication {

  private final AssigneeGetAllService assigneeGetAllService;

  public Flux<Assignee> getAll() {
    return assigneeGetAllService.getAll();
  }

}
