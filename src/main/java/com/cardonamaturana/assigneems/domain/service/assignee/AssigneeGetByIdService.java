package com.cardonamaturana.assigneems.domain.service.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import reactor.core.publisher.Mono;

public interface AssigneeGetByIdService {

  Mono<Assignee> get(Mono<String> id);

}
