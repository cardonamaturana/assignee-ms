package com.cardonamaturana.assigneems.application.employee;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.domain.service.employee.EmployeeSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class EmployeeSaveApplication {

  private final EmployeeSaveService employeeSaveService;

  public Mono<Employee> save(Employee employee) {
    return employeeSaveService.save(employee);
  }

}
