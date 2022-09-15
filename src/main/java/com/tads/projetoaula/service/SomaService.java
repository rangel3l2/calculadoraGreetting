package com.tads.projetoaula.service;

import org.springframework.stereotype.Service;

import com.tads.projetoaula.model.Resultado;
import com.tads.projetoaula.model.Soma;

@Service
public class SomaService {

    public Resultado somarNum( Soma soma){
    
    Resultado resultado = new Resultado();
    resultado.setResultado(soma.getNum1() + soma.getNum2());
    return resultado;
        
    }
    
}
