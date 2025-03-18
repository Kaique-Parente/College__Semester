/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaojogopokemon;

import cartaspokemon.CartaPokemon;
import cartaspokemon.TipoPokemon;
import gamemanager.GameManager;
import itens.TipoItens;
import jogador.Jogador;

/**
 *
 * @author bruno
 */
public class AplicacaoJogoPokemon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Jogador romano = new Jogador(new CartaPokemon(TipoPokemon.CHARMANDER), 
                                    TipoItens.BAND, 
                                    100 );
        
        
        
        System.out.println(romano.getNomeCarta());
        
        System.out.println("-------------");
        System.out.println(romano.getCartas().evoluirPokemon(TipoPokemon.CHARMANDER, TipoPokemon.CHARMELEON));
        System.out.println(romano.getNomeCarta());
        /*boolean resultEvolution = romano.getCartas().evoluirPokemon(TipoPokemon.CHARMANDER, TipoPokemon.CHARMELEON);
        
        if(resultEvolution){
            System.out.println("O seu pokemon conseguiu evoluir!");
        } else {
            System.out.println("O seu pokemon não conseguiu evoluir!");
        }
            */
    
        GameManager gm = GameManager.getInstance("Kaique");
        gm.iniciarMenu();

        GameManager gt = GameManager.getInstance("NaoTrocarNome");
        gt.iniciarMenu();
    }
    
}
