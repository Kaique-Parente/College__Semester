/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartaspokemon;

/**
 *
 * @author bruno
 */
public class CartaPokemon implements Cartas{
    
    private TipoPokemon pkm;
    
    public CartaPokemon(){
        this.pkm = TipoPokemon.CHARMANDER;
    }
    
    public CartaPokemon(TipoPokemon pkm){
        this.pkm = pkm;
    }
    
    public TipoPokemon getTipoPokemon(){
        return this.pkm;
    }
    
    @Override
    public boolean adicionaCarta(CartaPokemon cpkm){
        if (this.pkm != null) return false;
        this.pkm = cpkm.getTipoPokemon();
        return true;
    }
    
    @Override
    public int getHP(){
        return this.pkm.getHP();
    }
    
    @Override
    public int getATK(){
        return this.pkm.getATK();
    }
    
    @Override
    public int getDEF(){
        return this.pkm.getDEF();
    }
    
    @Override
    public String getNome(){
        return this.pkm.name();
    }

    @Override
    public CartaPokemon[] getCartas() {
        CartaPokemon[] tmp = new CartaPokemon[1];
        tmp[0] = new CartaPokemon(this.pkm);
        
        return tmp;
    }
    
}

    
    

