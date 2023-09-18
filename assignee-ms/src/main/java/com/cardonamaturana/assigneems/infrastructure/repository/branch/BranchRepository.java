package com.cardonamaturana.assigneems.infrastructure.repository.branch;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface BranchRepository extends ReactiveMongoRepository<BranchDto, String> {

}
