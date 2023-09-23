package com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PragmaticoUpdateRequestMapper {

  @Mapping(target = "id", source = "pragmaticoId")
  Pragmatico toEntity(PragmaticoUpdateRequest pragmaticoUpdateRequest);

}
