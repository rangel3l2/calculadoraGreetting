package com.tads.projetoaula.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tads.projetoaula.model.Greeting;


@RestController
@RequestMapping(value = "greeting")
public class GreettingController {

    @GetMapping
    public ResponseEntity <String> digaOla(){
        Greeting greeting = new Greeting();
       
        return ResponseEntity.ok( greeting.getSaudacao());

    }

     
}

