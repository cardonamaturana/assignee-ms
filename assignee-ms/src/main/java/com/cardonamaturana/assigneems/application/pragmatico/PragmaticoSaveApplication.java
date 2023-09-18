package com.cardonamaturana.assigneems.application.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.domain.service.assignee.AssigneeSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PragmaticoSaveApplication {

  private final AssigneeSaveService assigneeSaveService;

  public Mono<Pragmatico> save(Assignee pragmatico) {
    return assigneeSaveService.save(pragmatico).map(assignee -> (Pragmatico) assignee);
  }

}
