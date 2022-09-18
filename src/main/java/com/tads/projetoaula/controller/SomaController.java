package com.tads.projetoaula.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tads.projetoaula.model.Resultado;
import com.tads.projetoaula.model.Soma;
import com.tads.projetoaula.service.SomaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;



@RestController
@RequestMapping(value = "calculator")
public class SomaController {
        @Autowired
        SomaService somaService;

    @GetMapping(value = "/{num1}/{num2}") 
    public Resultado GetSoma(@PathVariable Float num1, @PathVariable Float  num2)
        {   
           
            Soma soma= new Soma();
            soma.setNum1(num1);
            soma.setNum2(num2);

        return somaService.somarNum(soma);

        }
   
     // Método POST com Body Params
     @PostMapping(value = "/")
     @ResponseStatus(HttpStatus.CREATED) // É possível predeterminar todos os Status Code lançados por um método
     public Resultado operacao(@RequestBody Soma soma) {    
        
    //a instancia soma possue o valor que é enviado via post
        
        return somaService.somarNum(soma) ;
     }
    

    
}
