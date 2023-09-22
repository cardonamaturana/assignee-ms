package com.cardonamaturana.assigneems.infrastructure.api.mapper.contributor;

import com.cardonamaturana.assigneems.domain.entity.Contributor;
import com.cardonamaturana.assigneems.infrastructure.api.dto.request.contributor.ContributorRequest;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-22T09:35:21-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
@Component
public class ContributorRequestMapperImpl implements ContributorRequestMapper {

    @Override
    public Contributor toEntity(ContributorRequest contributorRequest) {
        if ( contributorRequest == null ) {
            return null;
        }

        Contributor contributor = new Contributor();

        contributor.setFullName( contributorRequest.getFullName() );
        contributor.setDocumentType( contributorRequest.getDocumentType() );
        contributor.setDocumentNumber( contributorRequest.getDocumentNumber() );
        contributor.setPersonalEmail( contributorRequest.getPersonalEmail() );
        contributor.setCompany( contributorRequest.getCompany() );
        contributor.setServiceDescription( contributorRequest.getServiceDescription() );
        contributor.setServiceEndDate( contributorRequest.getServiceEndDate() );
        contributor.setTotalServicePayment( contributorRequest.getTotalServicePayment() );
        contributor.setCurrency( contributorRequest.getCurrency() );

        return contributor;
    }
}
