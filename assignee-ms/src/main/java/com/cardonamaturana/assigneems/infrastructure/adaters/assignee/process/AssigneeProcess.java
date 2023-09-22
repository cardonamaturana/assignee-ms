package com.cardonamaturana.assigneems.infrastructure.adaters.assignee.process;


import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeIsExistByIdService;
import com.cardonamaturana.assigneems.shared.exceptions.base.assignee.AssigneeNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AssigneeProcess {

  private final AssigneeIsExistByIdService assigneeIsExistByIdService;

  public Mono<Void> validateForUpdate(String id) {
    return assigneeIsExistByIdService.isExistById(id).flatMap(isExist -> {
      if (!isExist) {
        return Mono.error(new AssigneeNotFoundException());
      }
      return Mono.empty();
    });
  }

}
