/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartaspokemon;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class Deck implements Cartas{

    ArrayList<CartaPokemon> deck;
    
    @Override
    public boolean adicionaCarta(CartaPokemon carta){
        if (deck.size() >= 6) {return false;}    
        deck.add(carta);
        return true;
    }
    
    public boolean removeCarta(String nome){
        return true;
    }
    
    public Deck(){
        this.deck = new ArrayList<>();
    }
    
    @Override
    public CartaPokemon[] getCartas() {
        CartaPokemon[] tmp = new CartaPokemon[this.deck.size()];
        for (int i = 0; i < this.deck.size(); i++){
            tmp[i] = this.deck.get(i);
        }
        return tmp;
    }
    
    
    @Override
    public String getNome() {
        String temp = "";
        
        for (CartaPokemon c: deck){
            temp = temp + c.getNome() + "\n";
        }        
        return temp;
    }

    @Override
    public int getHP() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getATK() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int getDEF() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
