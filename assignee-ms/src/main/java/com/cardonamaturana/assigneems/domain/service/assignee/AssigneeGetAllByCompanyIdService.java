package com.cardonamaturana.assigneems.domain.service.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import reactor.core.publisher.Flux;

public interface AssigneeGetAllByCompanyIdService {

  Flux<Assignee> getAll(String companyId);

}
