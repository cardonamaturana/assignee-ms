package com.cardonamaturana.assigneems.infrastructure.repository.assignee;

import com.cardonamaturana.assigneems.infrastructure.repository.branch.BranchDto;
import com.cardonamaturana.assigneems.infrastructure.repository.employee.EmployeeDto;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.query.Param;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AssigneeRepository extends ReactiveMongoRepository<AssigneeDto, String> {


  @Query("{ 'personalEmail': ?0, '_class': 'EmployeeDto' }")
  Mono<AssigneeDto> getByEmail(@Param("employeeEmail") Mono<String> employeeEmail);

  @Query("{ 'company._id': ?0, '_class': {'$in': ['EmployeeDto', 'PragmaticoDto', 'ContributorDto'] } }")
  Flux<AssigneeDto> getByCompanyId(ObjectId companyId);


  @Query("{ '_class': 'BranchDto' }")
  Flux<BranchDto> getAllBranches();

  @Query("{ '_class': {'$in': ['EmployeeDto', 'PragmaticoDto', 'ContributorDto'] }}")
  Flux<EmployeeDto> getAllEmployees();


}
