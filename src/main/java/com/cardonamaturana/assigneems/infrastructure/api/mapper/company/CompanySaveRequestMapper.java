package com.cardonamaturana.assigneems.infrastructure.api.mapper.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.company.CompanySaveRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CompanySaveRequestMapper {

  @Mapping(source = "companyName", target = "name")
  Company toEntity(CompanySaveRequest companySaveRequest);

}
