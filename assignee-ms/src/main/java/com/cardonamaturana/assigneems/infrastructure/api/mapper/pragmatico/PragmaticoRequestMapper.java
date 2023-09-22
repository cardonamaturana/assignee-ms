package com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoSaveRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PragmaticoRequestMapper {

  Pragmatico toEntity(PragmaticoSaveRequest pragmaticoSaveRequest);

}
