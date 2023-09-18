package com.cardonamaturana.assigneems.infrastructure.repository.employee;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<EmployeeDto, String> {

}
