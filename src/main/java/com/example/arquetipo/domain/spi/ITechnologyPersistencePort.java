package com.example.arquetipo.domain.spi;
import com.example.arquetipo.domain.model.Technology;
import java.util.List;

public interface ITechnologyPersistencePort {
    void createTechnology(Technology technology);
    List<Technology> getAllTechnology();

    Technology getPokemon(Long id_pokemon);
}
