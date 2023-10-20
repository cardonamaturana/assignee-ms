package com.cardonamaturana.assigneems.infrastructure.repository.employee;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface EmployeeRepository extends ReactiveMongoRepository<EmployeeDto, String> {

}
