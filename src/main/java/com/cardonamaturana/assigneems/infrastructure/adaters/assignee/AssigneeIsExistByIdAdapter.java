package com.cardonamaturana.assigneems.infrastructure.adaters.assignee;

import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeIsExistByIdService;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssigneeIsExistByIdAdapter implements AssigneeIsExistByIdService {

  private final AssigneeRepository assigneeRepository;

  @Override
  public Mono<Boolean> isExistById(String id) {
    return assigneeRepository.existsById(id);
  }
}
