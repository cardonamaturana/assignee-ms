package com.cardonamaturana.assigneems.application.employee;

import com.cardonamaturana.assigneems.application.assignee.process.AssigneeProcess;
import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetAllByCompanyIdService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class EmployeeGetAllByCompanyIdApplication {

  private final AssigneeGetAllByCompanyIdService assigneeGetAllByCompanyIdService;
  private final AssigneeProcess assigneeProcess;

  public Flux<Assignee> getAll(String companyId) {
    return assigneeGetAllByCompanyIdService.getAll(companyId)
        .flatMap(employee -> assigneeProcess.processForGetAll(employee));
  }

}
