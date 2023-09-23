package com.cardonamaturana.assigneems.domain.service.assignee;

import reactor.core.publisher.Mono;

public interface AssigneeDeleteByIdService {

  Mono<Void> delete(Mono<String> id);

}
