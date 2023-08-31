package com.example.demo.services;

import com.example.demo.models.Unit_model;
import com.example.demo.repositories.Unit_repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnitService {

    @Autowired
    private Unit_repository unitRepository;

    public UnitService ( Unit_repository unitRepository){
        this.unitRepository = unitRepository;
    }

    public Unit_model saveUint( Unit_model unitModel){
        return this.unitRepository.save(unitModel);
    }

}
