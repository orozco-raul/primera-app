package com.rorozco.intecap.primeraapp.controller;

import com.rorozco.intecap.primeraapp.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ClienteController {
    @GetMapping("/index")
    public String getIndex(){
        return "Bienvenidos a mi API Rest - Spring Boot";
    }

    @GetMapping("/clientes")
    public ResponseEntity< List<Cliente>> getClientes(){
        //crear 3 clientes
        Cliente c1 =new Cliente(1,"Juan","Pérez","calle 1","12345678","email1");
        Cliente c2 =new Cliente(2,"Maria","López","calle 2", "12345678","email2");
        Cliente c3 =new Cliente(3,"Pedro","Gomez", "calle 3","12345678","email3");

        List<Cliente> clientes=List.of(c1,c2,c3);
        return new ResponseEntity<>( clientes, HttpStatus.OK);
    }
}
