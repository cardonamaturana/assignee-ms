package com.cardonamaturana.assigneems.infrastructure.repository.contributor;

import com.cardonamaturana.assigneems.domain.entity.Contributor;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T20:16:24-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class ContributorMapperImpl implements ContributorMapper {

    @Override
    public Contributor toEntity(ContributorDto contributorDto) {
        if ( contributorDto == null ) {
            return null;
        }

        Contributor.ContributorBuilder<?, ?> contributor = Contributor.builder();

        contributor.fullName( contributorDto.getFullName() );
        contributor.documentType( contributorDto.getDocumentType() );
        contributor.documentNumber( contributorDto.getDocumentNumber() );
        contributor.personalEmail( contributorDto.getPersonalEmail() );
        contributor.company( contributorDto.getCompany() );
        contributor.serviceDescription( contributorDto.getServiceDescription() );
        contributor.serviceEndDate( contributorDto.getServiceEndDate() );
        contributor.totalServicePayment( contributorDto.getTotalServicePayment() );
        contributor.currency( contributorDto.getCurrency() );

        return contributor.build();
    }

    @Override
    public ContributorDto toDto(Contributor contributor) {
        if ( contributor == null ) {
            return null;
        }

        ContributorDto.ContributorDtoBuilder<?, ?> contributorDto = ContributorDto.builder();

        contributorDto.fullName( contributor.getFullName() );
        contributorDto.documentType( contributor.getDocumentType() );
        contributorDto.documentNumber( contributor.getDocumentNumber() );
        contributorDto.personalEmail( contributor.getPersonalEmail() );
        contributorDto.company( contributor.getCompany() );
        contributorDto.serviceDescription( contributor.getServiceDescription() );
        contributorDto.serviceEndDate( contributor.getServiceEndDate() );
        contributorDto.totalServicePayment( contributor.getTotalServicePayment() );
        contributorDto.currency( contributor.getCurrency() );

        return contributorDto.build();
    }
}
