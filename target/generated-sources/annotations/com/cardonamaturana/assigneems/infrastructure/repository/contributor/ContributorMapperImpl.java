package com.cardonamaturana.assigneems.infrastructure.repository.contributor;

import com.cardonamaturana.assigneems.domain.entity.Contributor;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-18T16:11:23-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class ContributorMapperImpl implements ContributorMapper {

    @Override
    public Contributor toEntity(ContributorDto contributorDto) {
        if ( contributorDto == null ) {
            return null;
        }

        Contributor contributor = new Contributor();

        contributor.setFullName( contributorDto.getFullName() );
        contributor.setDocumentType( contributorDto.getDocumentType() );
        contributor.setDocumentNumber( contributorDto.getDocumentNumber() );
        contributor.setPersonalEmail( contributorDto.getPersonalEmail() );
        contributor.setCompany( contributorDto.getCompany() );
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

        contributorDto.setFullName( contributor.getFullName() );
        contributorDto.setDocumentType( contributor.getDocumentType() );
        contributorDto.setDocumentNumber( contributor.getDocumentNumber() );
        contributorDto.setPersonalEmail( contributor.getPersonalEmail() );
        contributorDto.setCompany( contributor.getCompany() );
        contributorDto.setServiceDescription( contributor.getServiceDescription() );
        contributorDto.setServiceEndDate( contributor.getServiceEndDate() );
        contributorDto.setTotalServicePayment( contributor.getTotalServicePayment() );
        contributorDto.setCurrency( contributor.getCurrency() );

        return contributorDto;
    }
}
