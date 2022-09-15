package com.tads.projetoaula.model;

import lombok.Data;

@Data
public class Greeting {
    private String saudacao;
    public Greeting(){
        this.saudacao = "<h2 style='color: yellow'>Hello word</h2>";
    }
}

