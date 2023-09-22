package com.cardonamaturana.assigneems.infrastructure.repository.company;

import com.cardonamaturana.assigneems.domain.entity.Company;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-21T22:38:07-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class CompanyMapperImpl implements CompanyMapper {

    @Override
    public Company toEntity(CompanyDto companyDto) {
        if ( companyDto == null ) {
            return null;
        }

        Company company = new Company();

        company.setName( companyDto.getName() );
        company.setNit( companyDto.getNit() );
        company.setLocation( companyDto.getLocation() );

        return company;
    }

    @Override
    public CompanyDto toDto(Company company) {
        if ( company == null ) {
            return null;
        }

        CompanyDto companyDto = new CompanyDto();

        companyDto.setName( company.getName() );
        companyDto.setNit( company.getNit() );
        companyDto.setLocation( company.getLocation() );

        return companyDto;
    }
}
