package com.cardonamaturana.assigneems.domain.service.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import reactor.core.publisher.Mono;

public interface AssigneeUpdateService {

  Mono<Assignee> update(Assignee assignee);

}
