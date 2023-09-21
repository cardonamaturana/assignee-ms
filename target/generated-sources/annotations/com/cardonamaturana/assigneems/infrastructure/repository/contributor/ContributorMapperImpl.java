package com.cardonamaturana.assigneems.infrastructure.repository.contributor;

import com.cardonamaturana.assigneems.domain.entity.Company;
import com.cardonamaturana.assigneems.domain.entity.Contributor;
import com.cardonamaturana.assigneems.infrastructure.repository.company.CompanyDto;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-21T18:17:55-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ContributorMapperImpl implements ContributorMapper {

    @Override
    public Contributor toEntity(ContributorDto contributorDto) {
        if ( contributorDto == null ) {
            return null;
        }

        Contributor contributor = new Contributor();

        contributor.setId( contributorDto.getId() );
        contributor.setFullName( contributorDto.getFullName() );
        contributor.setDocumentType( contributorDto.getDocumentType() );
        contributor.setDocumentNumber( contributorDto.getDocumentNumber() );
        contributor.setPersonalEmail( contributorDto.getPersonalEmail() );
        contributor.setCompany( companyDtoToCompany( contributorDto.getCompany() ) );
        contributor.setServiceDescription( contributorDto.getServiceDescription() );
        contributor.setServiceEndDate( contributorDto.getServiceEndDate() );
        contributor.setTotalServicePayment( contributorDto.getTotalServicePayment() );
        contributor.setCurrency( contributorDto.getCurrency() );

        return contributor;
    }

    @Override
    public ContributorDto toDto(Contributor contributor) {
        if ( contributor == null ) {
            return null;
        }

        ContributorDto contributorDto = new ContributorDto();

        contributorDto.setId( contributor.getId() );
        contributorDto.setFullName( contributor.getFullName() );
        contributorDto.setDocumentType( contributor.getDocumentType() );
        contributorDto.setDocumentNumber( contributor.getDocumentNumber() );
        contributorDto.setPersonalEmail( contributor.getPersonalEmail() );
        contributorDto.setCompany( companyToCompanyDto( contributor.getCompany() ) );
        contributorDto.setServiceDescription( contributor.getServiceDescription() );
        contributorDto.setServiceEndDate( contributor.getServiceEndDate() );
        contributorDto.setTotalServicePayment( contributor.getTotalServicePayment() );
        contributorDto.setCurrency( contributor.getCurrency() );

        return contributorDto;
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
