package com.cardonamaturana.assigneems.infrastructure.repository.contributor;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ContributorRepository extends ReactiveMongoRepository<ContributorDto, String> {

}
