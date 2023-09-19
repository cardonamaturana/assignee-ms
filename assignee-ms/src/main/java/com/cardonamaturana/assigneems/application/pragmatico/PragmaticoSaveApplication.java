package com.cardonamaturana.assigneems.application.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.domain.service.pragmatico.PragmaticoSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class PragmaticoSaveApplication {

  private final PragmaticoSaveService pragmaticoSaveService;

  public Mono<Pragmatico> save(Pragmatico pragmatico) {
    return pragmaticoSaveService.save(pragmatico);
  }

}
