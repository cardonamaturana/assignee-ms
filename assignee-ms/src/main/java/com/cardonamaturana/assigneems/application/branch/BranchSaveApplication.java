package com.cardonamaturana.assigneems.application.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import com.cardonamaturana.assigneems.domain.service.branch.BranchSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BranchSaveApplication {

  private final BranchSaveService branchSaveService;

  public Mono<Branch> save(Branch branch) {
    return branchSaveService.save(branch);
  }

}
