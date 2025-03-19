/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jogador;

import cartaspokemon.*;
import itens.*;

/**
 *
 * @author bruno
 */
public class Jogador {
    
    private Cartas carta;
    private TipoItens item;
    private int hp;
    
    public Jogador(){
        this.carta = new Deck();       
        this.carta.adicionaCarta(new CartaPokemon(TipoPokemon.CHARMANDER));
        this.carta.adicionaCarta(new CartaPokemon(TipoPokemon.CHARMANDER));
        
        this.item = TipoItens.POCAO;
        this.hp = 50;
    }
    
    public Jogador (CartaPokemon c, TipoItens i, int hp){
        this.carta = c;
        this.item = i;
        this.hp = hp;
    } 
    
    public String getNomeCarta(){
        return carta.getNome();
    }

    public Cartas getCartas(){
        return carta;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }
    
    public boolean adicionaCarta(CartaPokemon cpkm){
        if(carta.getClass().getSimpleName().equals("CartaPokemon")){
            Cartas tmp = this.carta;
            this.carta = new Deck();
            this.carta.adicionaCarta(tmp.getCartas()[0]); 
        }
        return this.carta.adicionaCarta(cpkm);
    }
    
    
}
