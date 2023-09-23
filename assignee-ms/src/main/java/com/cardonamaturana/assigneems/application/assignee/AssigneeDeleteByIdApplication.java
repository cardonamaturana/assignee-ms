package com.cardonamaturana.assigneems.application.assignee;

import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeDeleteByIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class AssigneeDeleteByIdApplication {

  private final AssigneeDeleteByIdService assigneeDeleteByIdService;

  public Mono<Void> delete(Mono<String> id) {
    return assigneeDeleteByIdService.delete(id);
  }

}
