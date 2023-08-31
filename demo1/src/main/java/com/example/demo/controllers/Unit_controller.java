package com.example.demo.controllers;

import com.example.demo.models.Unit_model;
import com.example.demo.services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/unit")
public class Unit_controller {

    @Autowired
    private UnitService unitService;

    public Unit_controller(UnitService unitService){
        this.unitService = unitService;
    }

    @PostMapping("/post")
    public @ResponseBody ResponseEntity<Unit_model> postUnit(@RequestBody Unit_model unitModel){
        return new ResponseEntity<>(this.unitService.saveUint(unitModel), HttpStatus.CREATED);
    }
}
