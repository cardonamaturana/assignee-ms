package com.cardonamaturana.assigneems.infrastructure.repository.assignee;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.Param;
import reactor.core.publisher.Mono;

public interface AssigneeRepository extends ReactiveMongoRepository<AssigneeDto, String> {


  @Query("{ 'personalEmail': ?0, '_class': 'EmployeeDto' }")
  Mono<AssigneeDto> getByEmail(@Param("employeeEmail") Mono<String> employeeEmail);

}
