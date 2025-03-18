/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package itens;

/**
 *
 * @author bruno
 */
public enum TipoItens {
    
    POCAO(3, 1),
    BERRY (0, 5),
    BAND (10, -1);
    
    int atk;
    int def;

    private TipoItens(int atk, int def) {
        this.atk = atk;
        this.def = def;
    }
    
    public int melhoraATK(){ return this.atk; }
    public int melhoraDEF(){ return this.def; }
    
    
    
}
