package com.cardonamaturana.assigneems.domain.service.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import reactor.core.publisher.Flux;

public interface AssigneeGetAllService {

  Flux<Assignee> getAll();

}
