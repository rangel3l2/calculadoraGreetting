package com.tads.projetoaula.model;


import lombok.Data;

@Data
public class Soma {
   

    private double num1;
    private double num2;
  
    public Soma() {
    
      
    } 
  
    public Float somar(float numb1, float numb2){

      return numb1 + numb2;
    }
  

}
