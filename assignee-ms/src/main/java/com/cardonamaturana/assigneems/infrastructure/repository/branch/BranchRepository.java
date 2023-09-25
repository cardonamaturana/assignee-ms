package com.cardonamaturana.assigneems.infrastructure.repository.branch;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface BranchRepository extends ReactiveMongoRepository<BranchDto, String> {

}
