package com.cardonamaturana.assigneems.infrastructure.repository.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import org.mapstruct.Mapper;

@Mapper
public interface CompanyMapper {

  Company toEntity(CompanyDto companyDto);

  CompanyDto toDto(Company company);

}
