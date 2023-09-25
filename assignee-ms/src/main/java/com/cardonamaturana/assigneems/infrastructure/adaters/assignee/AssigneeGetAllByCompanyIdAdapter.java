package com.cardonamaturana.assigneems.infrastructure.adaters.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetAllByCompanyIdService;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeRepository;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service()
@RequiredArgsConstructor
public class AssigneeGetAllByCompanyIdAdapter implements AssigneeGetAllByCompanyIdService {

  private final AssigneeRepository assigneeRepository;
  private final AssigneeMapper assigneeMapper;

  @Override
  public Flux<Assignee> getAll(String companyId) {
    return assigneeRepository.getByCompanyId(new ObjectId(companyId)).map(assigneeMapper::toEntity);
  }
}
