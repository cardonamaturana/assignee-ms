package com.cardonamaturana.assigneems.application.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.domain.service.pragmatico.PragmaticoGetAllService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class PragmaticoGetAllApplication {

  private final PragmaticoGetAllService pragmaticoGetAllService;

  public Flux<Pragmatico> getAll() {
    return pragmaticoGetAllService.getAll();
  }

}
