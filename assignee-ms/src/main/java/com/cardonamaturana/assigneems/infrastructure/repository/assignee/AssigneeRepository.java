package com.cardonamaturana.assigneems.infrastructure.repository.assignee;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AssigneeRepository extends ReactiveMongoRepository<AssigneeDto, String> {

}
