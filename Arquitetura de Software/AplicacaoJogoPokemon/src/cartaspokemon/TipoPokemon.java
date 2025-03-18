/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cartaspokemon;

/**
 *
 * @author bruno
 */
public enum TipoPokemon {
    
    CHARMANDER{
        @Override
        public int getHP()  { return 7;}
        @Override
        public int getATK() { return 5;};
        @Override
        public int getDEF() {return 10;};
    },
    CHARMELEON{
       @Override
        public int getHP()  { return 11;}
        @Override
        public int getATK() { return 12;};
        @Override
        public int getDEF() {return 6;};
    
    };
    
    abstract int getHP();
    abstract int getATK();
    abstract int getDEF();
    
    
    
}
