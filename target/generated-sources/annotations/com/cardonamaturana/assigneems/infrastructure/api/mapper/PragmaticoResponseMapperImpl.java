package com.cardonamaturana.assigneems.infrastructure.api.mapper;

import com.cardonamaturana.assigneems.domain.entity.Assignee;
import com.cardonamaturana.assigneems.infrastructure.api.dto.response.pragmatico.PragmaticoResponse;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-09-17T20:16:24-0500",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.6 (Oracle Corporation)"
)
public class PragmaticoResponseMapperImpl implements PragmaticoResponseMapper {

    @Override
    public PragmaticoResponse toDto(Assignee assignee) {
        if ( assignee == null ) {
            return null;
        }

        PragmaticoResponse pragmaticoResponse = new PragmaticoResponse();

        return pragmaticoResponse;
    }
}
