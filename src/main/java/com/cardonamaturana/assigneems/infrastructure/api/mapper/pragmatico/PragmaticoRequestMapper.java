package com.cardonamaturana.assigneems.infrastructure.api.mapper.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.pragmatico.PragmaticoSaveRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PragmaticoRequestMapper {

  @Mapping(source = "companyId", target = "company.id")
  Pragmatico toEntity(PragmaticoSaveRequest pragmaticoSaveRequest);

}
