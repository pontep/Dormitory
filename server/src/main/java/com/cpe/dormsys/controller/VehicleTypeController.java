package com.cpe.dormsys.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import com.cpe.dormsys.entity.VehicleType;
import com.cpe.dormsys.repository.VehicleTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class VehicleTypeController {

    @Autowired
    private final VehicleTypeRepository vehicleTypeRepository;

    public VehicleTypeController(VehicleTypeRepository vehicleTypeRepository) {
        this.vehicleTypeRepository = vehicleTypeRepository;
    }

    @GetMapping("/vehicleType")
    public Collection<VehicleType> getVehicleTypes() {
        return vehicleTypeRepository.findAll().stream().collect(Collectors.toList());
    }
}