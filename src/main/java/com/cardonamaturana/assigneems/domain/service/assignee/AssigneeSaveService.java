package com.cardonamaturana.assigneems.domain.service.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.entity.Branch;
import reactor.core.publisher.Mono;

public interface AssigneeSaveService {

  Mono<Assignee> save(Assignee assignee);

}
