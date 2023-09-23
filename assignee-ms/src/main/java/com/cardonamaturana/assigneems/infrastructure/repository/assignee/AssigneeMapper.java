package com.cardonamaturana.assigneems.infrastructure.repository.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.domain.entity.Contributor;
import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.repository.branch.BranchDto;
import com.cardonamaturana.assigneems.infrastructure.repository.branch.BranchMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.contributor.ContributorDto;
import com.cardonamaturana.assigneems.infrastructure.repository.contributor.ContributorMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeDto;
import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeMapper;
import com.cardonamaturana.assigneems.infrastructure.repository.pragmatico.PragmaticoDto;
import com.cardonamaturana.assigneems.infrastructure.repository.pragmatico.PragmaticoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AssigneeMapper {

  private final EmployeeMapper employeeMapper;
  private final PragmaticoMapper pragmaticoMapper;
  private final BranchMapper branchMapper;
  private final ContributorMapper contributorMapper;


  public AssigneeDto toDto(Assignee assignee) {
    AssigneeDto assignDto;

    if (assignee instanceof Contributor) {
      assignDto = contributorMapper.toDto((Contributor) assignee);
      assignDto.setId(assignee.getId());
      return assignDto;
    } else if (assignee instanceof Pragmatico) {
      assignDto = pragmaticoMapper.toDto((Pragmatico) assignee);
      assignDto.setId(assignee.getId());
      return assignDto;
    } else if (assignee instanceof Branch) {
      assignDto = branchMapper.toDto((Branch) assignee);
      assignDto.setId(assignee.getId());
      return assignDto;
    } else if (assignee instanceof Employee) {
      assignDto = employeeMapper.toDto((Employee) assignee);
      assignDto.setId(assignee.getId());
      return assignDto;
    }
    throw new IllegalArgumentException("Unsupported Assignee type: " + assignee.getClass());
  }


  public Assignee toEntity(AssigneeDto assigneeDto) {
    Assignee assign;

    if (assigneeDto instanceof ContributorDto) {
      assign = contributorMapper.toEntity((ContributorDto) assigneeDto);
      assign.setId(assigneeDto.getId());
      return assign;
    } else if (assigneeDto instanceof PragmaticoDto) {
      assign = pragmaticoMapper.toEntity((PragmaticoDto) assigneeDto);
      assign.setId(assigneeDto.getId());
      return assign;
    } else if (assigneeDto instanceof BranchDto) {
      assign = branchMapper.toEntity((BranchDto) assigneeDto);
      assign.setId(assigneeDto.getId());
      return assign;
    } else if (assigneeDto instanceof EmployeeDto) {
      assign = employeeMapper.toEntity((EmployeeDto) assigneeDto);
      assign.setId(assigneeDto.getId());
      return assign;
    }
    throw new IllegalArgumentException("Unsupported Assignee type: " + assigneeDto.getClass());
  }

}
