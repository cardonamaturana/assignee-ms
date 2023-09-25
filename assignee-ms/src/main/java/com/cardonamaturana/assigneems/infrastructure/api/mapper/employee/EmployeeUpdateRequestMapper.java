package com.cardonamaturana.assigneems.infrastructure.api.mapper.employee;

import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.employee.EmployeeUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EmployeeUpdateRequestMapper {

  @Mapping(target = "id", source = "employeeId")
  @Mapping(source = "companyId", target = "company.id")
  Employee toEntity(EmployeeUpdateRequest employeeUpdateRequest);

}
