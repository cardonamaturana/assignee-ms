package com.cardonamaturana.assigneems.infrastructure.adaters.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetAllService;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service("assignee")
@RequiredArgsConstructor
public class AssigneeGetAllAdapter implements AssigneeGetAllService {

  private final AssigneeRepository assigneeRepository;
  private final AssigneeMapper assigneeMapper;

  @Override
  public Flux<Assignee> getAll() {
    return assigneeRepository.findAll().map(assigneeMapper::toEntity);
  }
}
