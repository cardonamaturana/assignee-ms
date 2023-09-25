package com.cardonamaturana.assigneems.infrastructure.api.mapper.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.company.CompanyResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompanyResponseMapper {

  @Mapping(source = "id", target = "companyId")
  @Mapping(source = "name", target = "companyName")
  CompanyResponse toDto(Company company);

}
