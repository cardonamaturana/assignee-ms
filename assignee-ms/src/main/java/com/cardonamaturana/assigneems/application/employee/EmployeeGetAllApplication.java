package com.cardonamaturana.assigneems.application.employee;

import com.cardonamaturana.assigneems.application.assignee.process.AssigneeProcess;
import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class EmployeeGetAllApplication {

  @Qualifier("employee")
  private final AssigneeGetAllService employeeGetAllService;
  private final AssigneeProcess assigneeProcess;

  public Flux<Assignee> getAll() {
    return employeeGetAllService.getAll()
        .flatMap(employee -> assigneeProcess.processForGetAll(employee));
  }


  public EmployeeGetAllApplication(@Qualifier("employee")AssigneeGetAllService employeeGetAllService,
      AssigneeProcess assigneeProcess) {
    this.employeeGetAllService = employeeGetAllService;
    this.assigneeProcess = assigneeProcess;
  }
}
