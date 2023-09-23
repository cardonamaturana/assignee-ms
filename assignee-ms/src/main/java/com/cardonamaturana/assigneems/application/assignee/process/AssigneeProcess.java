package com.cardonamaturana.assigneems.application.assignee.process;


import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetByIdService;
import com.cardonamaturana.assigneems.shared.exceptions.base.assignee.EntityTypeMismatchException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AssigneeProcess {

  private final AssigneeGetByIdService assigneeGetByIdService;

  public Mono<Void> validateForUpdate(Assignee assignee) {
    return assigneeGetByIdService.get(Mono.just(assignee.getId())).flatMap(result -> {
      if (!result.getClass().equals(assignee.getClass())) {
        return Mono.error(new EntityTypeMismatchException());
      }
      return Mono.empty();
    });
  }

}
