package com.cardonamaturana.assigneems.infrastructure.repository.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T00:49:22-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public Company toEntity(CompanyDto companyDto) {
        if ( companyDto == null ) {
            return null;
        }

        Company.CompanyBuilder<?, ?> company = Company.builder();

        company.name( companyDto.getName() );
        company.nit( companyDto.getNit() );
        company.location( companyDto.getLocation() );

        return company.build();
    }

    @Override
    public CompanyDto toDto(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDto.CompanyDtoBuilder<?, ?> companyDto = CompanyDto.builder();

        companyDto.name( company.getName() );
        companyDto.nit( company.getNit() );
        companyDto.location( company.getLocation() );

        return companyDto.build();
    }
}
