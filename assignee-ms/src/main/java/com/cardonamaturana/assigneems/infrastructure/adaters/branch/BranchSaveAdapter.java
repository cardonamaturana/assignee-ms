package com.cardonamaturana.assigneems.infrastructure.adaters.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.domain.service.branch.BranchSaveService;
import com.cardonamaturana.assigneems.infrastructure.repository.assignee.AssigneeRepository;
import com.cardonamaturana.assigneems.infrastructure.repository.branch.BranchMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
@RequiredArgsConstructor
public class BranchSaveAdapter implements BranchSaveService {

  private final AssigneeRepository assigneeRepository;
  private final BranchMapper branchMapper;

  @Override
  public Mono<Branch> save(Branch branch) {
    return assigneeRepository.save(branchMapper.toDto(branch))
        .map(branchMapper::toEntity);
  }
}