package com.cardonamaturana.assigneems.infrastructure.adaters.branch;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetAllService;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service("branch")
@RequiredArgsConstructor
public class BranchGetAllAdapter implements AssigneeGetAllService {

  private final AssigneeRepository assigneeRepository;
  private final AssigneeMapper assigneeMapper;

  @Override
  public Flux<Assignee> getAll() {
    return assigneeRepository.getAllBranches().map(assigneeMapper::toEntity);
  }
}
