package com.cardonamaturana.assigneems.domain.service.branch;

import com.cardonamaturana.assigneems.domain.entity.Branch;
import reactor.core.publisher.Mono;

public interface BranchSaveService {

  Mono<Branch> save(Branch branch);

}
