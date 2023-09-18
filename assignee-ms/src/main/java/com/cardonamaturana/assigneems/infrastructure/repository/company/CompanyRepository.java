package com.cardonamaturana.assigneems.infrastructure.repository.company;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CompanyRepository extends ReactiveMongoRepository<CompanyDto, String> {

}
