package com.example.arquetipo.domain.api.usecase;

import com.example.arquetipo.domain.spi.ICapacityPersistencePort;

public class CapacityUseCase {
    private final ICapacityPersistencePort capacityPersistencePort;
    public CapacityUseCase(ICapacityPersistencePort capacityPersistencePort) {
        this.capacityPersistencePort = capacityPersistencePort;
    }

    //@Override
    //public void createCapacity(Capacity capacity) {
    //    capacityPersistencePort.createCapacity(capacity);
    //}

    //@Override
    //public List<Technology> getAllTechnology() {
    //    return null;
    //}

    //@Override
    //public Technology getTechnology(Long id_technology) {
    //    return null;
    //}

}
