package com.cardonamaturana.assigneems.infrastructure.api.mapper.contributor;

import com.cardonamaturana.assigneems.domain.entity.Contributor;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.contributor.ContributorResponse;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-22T12:12:15-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ContributorResponseMapperImpl implements ContributorResponseMapper {

    @Override
    public ContributorResponse toDto(Contributor contributor) {
        if ( contributor == null ) {
            return null;
        }

        ContributorResponse contributorResponse = new ContributorResponse();

        contributorResponse.setId( contributor.getId() );
        contributorResponse.setFullName( contributor.getFullName() );
        contributorResponse.setDocumentType( contributor.getDocumentType() );
        contributorResponse.setDocumentNumber( contributor.getDocumentNumber() );
        contributorResponse.setPersonalEmail( contributor.getPersonalEmail() );
        contributorResponse.setCompany( contributor.getCompany() );
        contributorResponse.setServiceDescription( contributor.getServiceDescription() );
        contributorResponse.setServiceEndDate( contributor.getServiceEndDate() );
        contributorResponse.setTotalServicePayment( contributor.getTotalServicePayment() );
        contributorResponse.setCurrency( contributor.getCurrency() );

        return contributorResponse;
    }
}
