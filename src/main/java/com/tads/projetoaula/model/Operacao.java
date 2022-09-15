package com.tads.projetoaula.model;

import java.util.UUID;

import lombok.Data;

@Data
public class Operacao {
    public Operacao() {
    
      
    }
    private UUID id;
    private float num1;
    private float num2;
  

  
    public  Float soma(Float numb1, Float numb2){

      return numb1 + numb2;
    }
    public  Float sub(Float numb1, Float numb2){

      return numb1 - numb2;
    }
    public  Float mult(Float numb1, Float numb2){

      return numb1 * numb2;
    }
    public  Float div(Float numb1, Float numb2){

      return numb1 / numb2;
    }
    

}
