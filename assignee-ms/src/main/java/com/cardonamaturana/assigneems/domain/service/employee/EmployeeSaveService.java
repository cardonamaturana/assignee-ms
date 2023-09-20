package com.cardonamaturana.assigneems.domain.service.employee;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import reactor.core.publisher.Mono;

public interface EmployeeSaveService {

  Mono<Employee> save(Employee employee);

}
