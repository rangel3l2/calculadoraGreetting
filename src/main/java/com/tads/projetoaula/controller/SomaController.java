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

import org.springframework.http.HttpStatus;



@RestController
@RequestMapping(value = "calculator")
public class SomaController {


    @GetMapping(value = "/{numb1}/{numb2}") 
    public Float GetSoma(@PathVariable Float numb1, @PathVariable Float  numb2)
        {
            Soma soma= new Soma();
            
        return soma.somar(numb1, numb2);

        }
   
     // Método POST com Body Params
     @PostMapping(value = "/")
     @ResponseStatus(HttpStatus.CREATED) // É possível predeterminar todos os Status Code lançados por um método
     public Resultado operacao(@RequestBody Soma soma) {
        Resultado resultado  = new Resultado();
        resultado.setResultado(soma.getNum1() + soma.getNum2());
        
        
        return  resultado;
     }
    

    
}
