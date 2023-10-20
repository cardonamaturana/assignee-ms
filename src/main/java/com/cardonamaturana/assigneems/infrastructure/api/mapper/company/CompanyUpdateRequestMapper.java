package com.cardonamaturana.assigneems.infrastructure.api.mapper.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.company.CompanyUpdateRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompanyUpdateRequestMapper {

  @Mapping(source = "companyName", target = "name")
  @Mapping(source = "companyId", target = "id")
  Company toEntity(CompanyUpdateRequest companyUpdateRequest);

}
