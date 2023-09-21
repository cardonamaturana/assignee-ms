package com.cardonamaturana.assigneems.infrastructure.repository.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.repository.branch.BranchDto;
import com.cardonamaturana.assigneems.infrastructure.repository.branch.BranchMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.contributor.ContributorMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeDto;
import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.pragmatico.PragmaticoDto;
import com.cardonamaturana.assigneems.infrastructure.repository.pragmatico.PragmaticoMapper;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.mapstruct.Mapper;

@RequiredArgsConstructor
@Getter
@Mapper(componentModel = "spring", uses = {PragmaticoMapper.class, ContributorMapper.class,
    BranchMapper.class, Company.class, EmployeeMapper.class})
public class AssigneeMapper {

  private final EmployeeMapper employeeMapper;
  private final PragmaticoMapper pragmaticoMapper;
  private final BranchMapper branchMapper;


  public AssigneeDto toDto(Assignee assignee) {
    if (assignee instanceof Branch) {
      return branchMapper.toDto((Branch) assignee);
    } else if (assignee instanceof Employee) {
      return employeeMapper.toDto((Employee) assignee);
    } else if (assignee instanceof Pragmatico) {
      return pragmaticoMapper.toDto((Pragmatico) assignee);
    }
    throw new IllegalArgumentException("Unsupported Assignee type: " + assignee.getClass());
  }

  Assignee toEntity(AssigneeDto assigneeDto){
    if (assigneeDto instanceof BranchDto) {
      return branchMapper.toEntity((BranchDto) assigneeDto);
    } else if (assigneeDto instanceof EmployeeDto) {
      return employeeMapper.toEntity((EmployeeDto) assigneeDto);
    } else if (assigneeDto instanceof PragmaticoDto) {
      return pragmaticoMapper.toEntity((PragmaticoDto) assigneeDto);
    }
    throw new IllegalArgumentException("Unsupported Assignee type: " + assigneeDto.getClass());
  }

}
