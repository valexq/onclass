package com.example.arquetipo.domain.api;
import com.example.arquetipo.domain.model.Technology;
import java.util.List;
public interface ITechnologyServicePort {
    void createTechnology(Technology technology);

    List<Technology> getAllTechnology();
    Technology getTechnology(Long id_technology);


}
