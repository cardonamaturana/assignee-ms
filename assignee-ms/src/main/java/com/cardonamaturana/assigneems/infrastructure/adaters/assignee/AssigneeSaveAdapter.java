package com.cardonamaturana.assigneems.infrastructure.adaters.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeSaveService;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class AssigneeSaveAdapter implements AssigneeSaveService {

  private final AssigneeRepository assigneeRepository;
  private final AssigneeMapper assigneeMapper;

  @Override
  public Mono<Assignee> save(Assignee assignee) {
    return assigneeRepository.save(assigneeMapper.toDto(assignee))
        .map(assigneeMapper::toEntity);
  }
}
