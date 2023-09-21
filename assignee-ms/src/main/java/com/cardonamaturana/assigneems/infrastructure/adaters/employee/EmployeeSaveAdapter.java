package com.cardonamaturana.assigneems.infrastructure.adaters.employee;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.domain.service.employee.EmployeeSaveService;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeRepository;
import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class EmployeeSaveAdapter implements EmployeeSaveService {

  private final AssigneeRepository assigneeRepository;
  private final EmployeeMapper employeeMapper;

  @Override
  public Mono<Employee> save(Employee employee) {
    return assigneeRepository.save(employeeMapper.toDto(employee))
        .map(employeeMapper::toEntity);
  }
}
