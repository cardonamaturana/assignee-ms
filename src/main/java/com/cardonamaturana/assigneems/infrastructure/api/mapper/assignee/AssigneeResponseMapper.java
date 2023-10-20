package com.cardonamaturana.assigneems.infrastructure.api.mapper.assignee;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.domain.entity.Contributor;
import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.assignee.AssigneeResponse;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.branch.BranchResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.contributor.ContributorResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.employee.EmployeeResponseMapper;
import com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico.PragmaticoResponseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AssigneeResponseMapper {

  private final EmployeeResponseMapper employeeResponseMapper;
  private final PragmaticoResponseMapper pragmaticoResponseMapper;
  private final BranchResponseMapper branchResponseMapper;
  private final ContributorResponseMapper contributorResponseMapper;

  public AssigneeResponse toDto(Assignee assignee) {
    AssigneeResponse assignResponse;

    if (assignee instanceof Contributor) {
      assignResponse = contributorResponseMapper.toDto((Contributor) assignee);
      assignResponse.setId(assignee.getId());
      return assignResponse;
    } else if (assignee instanceof Pragmatico) {
      assignResponse = pragmaticoResponseMapper.toDto((Pragmatico) assignee);
      assignResponse.setId(assignee.getId());
      return assignResponse;
    } else if (assignee instanceof Branch) {
      assignResponse = branchResponseMapper.toDto((Branch) assignee);
      assignResponse.setId(assignee.getId());
      return assignResponse;
    } else if (assignee instanceof Employee) {
      assignResponse = employeeResponseMapper.toDto((Employee) assignee);
      assignResponse.setId(assignee.getId());
      return assignResponse;
    }
    throw new IllegalArgumentException("Unsupported Assignee type: " + assignee.getClass());
  }
}
