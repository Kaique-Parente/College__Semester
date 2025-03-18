/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cartaspokemon;

/**
 *
 * @author bruno
 */
public interface Cartas {
    
    public String getNome();
    public boolean adicionaCarta(CartaPokemon pkm);
    public int getHP();
    public int getATK();
    public int getDEF();
    public CartaPokemon[] getCartas();
    
    
    
}
