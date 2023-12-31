package com.cardonamaturana.assigneems.application.assignee.process;


import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.entity.Employee;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeGetByIdService;
import com.cardonamaturana.assigneems.domain.service.company.CompanyGetByIdService;
import com.cardonamaturana.assigneems.domain.service.company.CompanyIsExistByIdService;
import com.cardonamaturana.assigneems.shared.exceptions.base.assignee.AssigneeNotFoundException;
import com.cardonamaturana.assigneems.shared.exceptions.base.assignee.CompanyNotFoundException;
import com.cardonamaturana.assigneems.shared.exceptions.base.assignee.EntityTypeMismatchException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@Service
public class AssigneeProcess {

  private final AssigneeGetByIdService assigneeGetByIdService;
  private final CompanyGetByIdService companyGetByIdService;
  private final CompanyIsExistByIdService companyIsExistByIdService;

  public Mono<Assignee> processForSave(Assignee assignee) {
    return addCompany(assignee);
  }

  public Mono<Assignee> processForGetAssignee(Assignee assignee) {
    return addCompany(assignee);
  }

  public Mono<Assignee> processForGetAll(Assignee assignee) {
    return addCompany(assignee);
  }


  public Mono<Assignee> processForUpdate(Assignee assignee) {
    return isCorrectInstance(assignee).then(addCompany(assignee));
  }

  private Mono<Assignee> addCompany(Assignee assignee) {
    if (assignee instanceof Employee) {
      return companyGetByIdService.get(Mono.just(((Employee) assignee).getCompany().getId()))
          .flatMap(companyResult -> {
            ((Employee) assignee).setCompany(companyResult);
            return Mono.just(assignee);
          }).switchIfEmpty(Mono.error(new CompanyNotFoundException()));
    }
    return Mono.just(assignee);
  }

  private Mono<Void> isCorrectInstance(Assignee assignee) {
    return assigneeGetByIdService.get(Mono.just(assignee.getId())).flatMap(result -> {
      if (!result.getClass().equals(assignee.getClass())) {
        return Mono.error(new EntityTypeMismatchException());
      }
      return Mono.just(assignee);
    }).switchIfEmpty(Mono.error(new AssigneeNotFoundException())).then();
  }

}