package com.cardonamaturana.assigneems.application.branch;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class BranchGetAllApplication {

  private final AssigneeGetAllService branchGetAllService;

  public Flux<Assignee> getAll() {
    return branchGetAllService.getAll();
  }


  public BranchGetAllApplication(@Qualifier("branch")AssigneeGetAllService branchGetAllService) {
    this.branchGetAllService = branchGetAllService;
  }
}
