package com.cardonamaturana.assigneems.infrastructure.repository.employee;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import org.mapstruct.Mapper;

@Mapper
public interface EmployeeMapper {

  Employee toEntity(EmployeeDto employeeDto);

  EmployeeDto toDto(Employee employee);

}
