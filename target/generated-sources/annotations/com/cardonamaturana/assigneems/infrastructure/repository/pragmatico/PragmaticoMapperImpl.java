package com.cardonamaturana.assigneems.infrastructure.repository.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-22T12:12:15-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class PragmaticoMapperImpl implements PragmaticoMapper {

    @Override
    public Pragmatico toEntity(PragmaticoDto pragmaticoDto) {
        if ( pragmaticoDto == null ) {
            return null;
        }

        Pragmatico pragmatico = new Pragmatico();

        pragmatico.setId( pragmaticoDto.getId() );
        pragmatico.setFullName( pragmaticoDto.getFullName() );
        pragmatico.setDocumentType( pragmaticoDto.getDocumentType() );
        pragmatico.setDocumentNumber( pragmaticoDto.getDocumentNumber() );
        pragmatico.setPersonalEmail( pragmaticoDto.getPersonalEmail() );
        pragmatico.setCompany( companyDtoToCompany( pragmaticoDto.getCompany() ) );
        pragmatico.setContractType( pragmaticoDto.getContractType() );
        pragmatico.setJobTittle( pragmaticoDto.getJobTittle() );
        pragmatico.setWorkEmail( pragmaticoDto.getWorkEmail() );
        pragmatico.setSalary( pragmaticoDto.getSalary() );

        return pragmatico;
    }

    @Override
    public PragmaticoDto toDto(Pragmatico pragmatico) {
        if ( pragmatico == null ) {
            return null;
        }

        PragmaticoDto pragmaticoDto = new PragmaticoDto();

        pragmaticoDto.setId( pragmatico.getId() );
        pragmaticoDto.setFullName( pragmatico.getFullName() );
        pragmaticoDto.setDocumentType( pragmatico.getDocumentType() );
        pragmaticoDto.setDocumentNumber( pragmatico.getDocumentNumber() );
        pragmaticoDto.setPersonalEmail( pragmatico.getPersonalEmail() );
        pragmaticoDto.setCompany( companyToCompanyDto( pragmatico.getCompany() ) );
        pragmaticoDto.setContractType( pragmatico.getContractType() );
        pragmaticoDto.setJobTittle( pragmatico.getJobTittle() );
        pragmaticoDto.setWorkEmail( pragmatico.getWorkEmail() );
        pragmaticoDto.setSalary( pragmatico.getSalary() );

        return pragmaticoDto;
    }

    protected Company companyDtoToCompany(CompanyDto companyDto) {
        if ( companyDto == null ) {
            return null;
        }

        Company company = new Company();

        company.setName( companyDto.getName() );
        company.setNit( companyDto.getNit() );
        company.setLocation( companyDto.getLocation() );

        return company;
    }

    protected CompanyDto companyToCompanyDto(Company company) {
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
