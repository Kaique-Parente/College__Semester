package com.mycompany.aula06_ex2;

public class Aula06_Ex2 {

    public static void main(String[] args) {
        
        Lutador clube[] = new Lutador[2];
        clube[0] = new Lutador();
        clube[0].nome = "XXXXXX";
        clube[0].forca = 400;
        clube[0].arma.nome = "Revolver";
        clube[0].vida = 5;
        
        
        clube[1] = new Lutador();
        clube[1].nome = "YYYYY";
        clube[1].forca = 90;
        clube[1].arma.nome = "Carabina";
        clube[1].vida = 3;
        
        for(int i=0; i < clube.length; i++) {
            System.out.println("");
            System.out.println(clube[i].nome);
            System.out.println(clube[i].arma.nome);
            System.out.println(clube[i].forca);
        }
    }
}
