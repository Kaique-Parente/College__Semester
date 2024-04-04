package com.mycompany.aula06_ex1;

public class Aula06 {

    public static void main(String[] args) {
        
        Lutador martin = new Lutador();
        Lutador lucas = new Lutador();
        
        martin.nome = "Martin";
        martin.forca = 200;
        martin.vida = 10;
        
        lucas.nome = "Lucas";
        lucas.forca = 500;
        lucas.vida = 20;

        martin.arma.nome = "Revolver .30";
        lucas.arma.nome = "Espada Samurai";
        
        martin.arma.alcance = 5;
        lucas.arma.alcance = 0;
        
    }
}
