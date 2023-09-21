package com.cardonamaturana.assigneems.infrastructure.api.mapper.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.assignee.AssigneeResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.branch.BranchResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.employee.EmployeeResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico.PragmaticoResponseMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {EmployeeResponseMapper.class,
    PragmaticoResponseMapper.class, BranchResponseMapper.class})
public interface AssigneeResponseMapper {

  AssigneeResponse toDto(Assignee assignee);

}
