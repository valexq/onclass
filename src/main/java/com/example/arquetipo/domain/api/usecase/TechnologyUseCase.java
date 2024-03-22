package com.example.arquetipo.domain.api.usecase;
import com.example.arquetipo.domain.api.ITechnologyServicePort;
import com.example.arquetipo.domain.model.Technology;
import com.example.arquetipo.domain.spi.ITechnologyPersistencePort;
import java.util.List;

public class TechnologyUseCase implements ITechnologyServicePort {
    private final ITechnologyPersistencePort technologyPersistencePort;
    public TechnologyUseCase(ITechnologyPersistencePort technologyPersistencePort) {
        this.technologyPersistencePort = technologyPersistencePort;
    }
    @Override
    public void createTechnology(Technology technology) {
        //Validar que el nombre sea unico
        technologyPersistencePort.createTechnology(technology);
        {

        }
        //return technologyPersistencePort.createTechnology(technology);
    }

    @Override
    public List<Technology> getAllTechnology() {
        return technologyPersistencePort.getAllTechnology();
    }

    @Override
    public Technology getTechnology(Long id_technology) {
        return null;
    }


}
