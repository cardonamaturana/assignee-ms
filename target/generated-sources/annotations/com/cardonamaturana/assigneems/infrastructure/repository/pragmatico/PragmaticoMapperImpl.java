package com.cardonamaturana.assigneems.infrastructure.repository.pragmatico;

import com.cardonamaturana.assigneems.domain.entity.Pragmatico;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-19T21:04:15-0500",
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

        pragmatico.setFullName( pragmaticoDto.getFullName() );
        pragmatico.setDocumentType( pragmaticoDto.getDocumentType() );
        pragmatico.setDocumentNumber( pragmaticoDto.getDocumentNumber() );
        pragmatico.setPersonalEmail( pragmaticoDto.getPersonalEmail() );
        pragmatico.setCompany( pragmaticoDto.getCompany() );
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

        pragmaticoDto.setFullName( pragmatico.getFullName() );
        pragmaticoDto.setDocumentType( pragmatico.getDocumentType() );
        pragmaticoDto.setDocumentNumber( pragmatico.getDocumentNumber() );
        pragmaticoDto.setPersonalEmail( pragmatico.getPersonalEmail() );
        pragmaticoDto.setCompany( pragmatico.getCompany() );
        pragmaticoDto.setContractType( pragmatico.getContractType() );
        pragmaticoDto.setJobTittle( pragmatico.getJobTittle() );
        pragmaticoDto.setWorkEmail( pragmatico.getWorkEmail() );
        pragmaticoDto.setSalary( pragmatico.getSalary() );

        return pragmaticoDto;
    }
}
