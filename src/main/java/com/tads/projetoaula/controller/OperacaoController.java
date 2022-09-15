package com.tads.projetoaula.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import com.tads.projetoaula.model.Operacao;
import com.tads.projetoaula.service.OperacaoService;

@RestController
@RequestMapping(value = "operacao")
public class OperacaoController {
@Autowired
private OperacaoService service; 

@GetMapping(value = "/soma/{numb1}/{numb2}") 
public Float GetSoma(@PathVariable Float numb1, @PathVariable Float  numb2)
    {
        Operacao operacao = new Operacao();
        return operacao.soma(numb1, numb2); 

    }
    @GetMapping(value = "/sub/{numb1}/{numb2}") 
    public Float GetSub(@PathVariable Float numb1, @PathVariable Float  numb2)
    {
        Operacao operacao = new Operacao();
        return operacao.sub(numb1, numb2); 

    }
    
    @GetMapping(value = "/multi/{numb1}/{numb2}") 
    public Float GetMulti(@PathVariable Float numb1, @PathVariable Float  numb2)
        {
            Operacao operacao = new Operacao();
            return operacao.mult(numb1, numb2); 
    
        }
    @GetMapping(value = "/div/{numb1}/{numb2}") 
    public Float GetDiv(@PathVariable Float numb1, @PathVariable Float  numb2)
        {
            Operacao operacao = new Operacao();
            return operacao.div(numb1, numb2); 
    
        }
     // Método POST com Body Params
     @PostMapping(value = "/criar")
     @ResponseStatus(HttpStatus.NO_CONTENT) // É possível predeterminar todos os Status Code lançados por um método
     public Operacao operacao (@RequestBody Operacao operacao) {
        
        // Ao chamar uma classe do pacote Service, estou efetivamente usando a arquitetura em camadas
        return service.create(operacao);
     }
    

    
}
