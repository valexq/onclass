package com.example.arquetipo.application.mapper;
import com.example.arquetipo.application.dto.TechnologyRequest;
import com.example.arquetipo.domain.model.Technology;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface TechnologyRequestMapper {
    Technology toTechnology(TechnologyRequest technologyRequest);

}
