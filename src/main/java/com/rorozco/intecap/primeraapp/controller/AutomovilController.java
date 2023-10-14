package com.rorozco.intecap.primeraapp.controller;

import com.rorozco.intecap.primeraapp.model.Automovil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AutomovilController {
    @GetMapping("/automoviles")
    public ResponseEntity<List<Automovil>> getAutomoviles(){

        Automovil a1=new Automovil(1,"toyota","yaris","gris","P123XYZ",150000.00);
        Automovil a2=new Automovil(2,"toyota","corolla","negro","P234XYZ",200000.00);;
        Automovil a3=new Automovil(3,"kia","rio","gris","P345XYZ",100000.00);;
        Automovil a4=new Automovil(4,"kia","picanto","rojo","P456XYZ",80000.00);;
        Automovil a5=new Automovil(5,"honda","civic","blanco","P567XYZ",140000.00);;

        List<Automovil> autos=List.of(a1,a2,a3,a4,a5);
        return new ResponseEntity<>(autos, HttpStatus.OK);
    }
}
