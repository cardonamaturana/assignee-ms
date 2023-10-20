package com.cardonamaturana.assigneems.domain.service.assignee;

import reactor.core.publisher.Mono;

public interface AssigneeIsExistByIdService {

  Mono<Boolean> isExistById(String id);

}
