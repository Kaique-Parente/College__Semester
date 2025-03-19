/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacaojogopokemon;

import java.util.ArrayList;

import cartaspokemon.CartaPokemon;
import cartaspokemon.TipoPokemon;
import gamemanager.BatalhaFacade;
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
        
        Jogador romano = new Jogador(new CartaPokemon(TipoPokemon.CHARMANDER), TipoItens.BAND, 100 );

        System.out.println("-------------");
       
        /* Teste de evolução com apenas uma carta
        System.out.println(romano.getNomeCarta());
        System.out.println(romano.getCartas().getATK());

        boolean isEvolved = romano.getCartas().evoluirPokemon(TipoPokemon.CHARMANDER, TipoPokemon.CHARMELEON);
        if(isEvolved){
            System.out.println("Pokemon evoluido com sucesso!");
        }else {
            System.out.println("O seu pokemon não conseguiu evoluir!");
        }
        System.out.println(romano.getNomeCarta());
        System.out.println(romano.getCartas().getATK());
        */

        /* Teste de evolução com DECK
        romano.adicionaCarta(new CartaPokemon(TipoPokemon.CHARMANDER));
        System.out.println(romano.getCartas());

        boolean isEvolved = romano.getCartas().evoluirPokemon(TipoPokemon.CHARMANDER, TipoPokemon.CHARMELEON);
        
        if(isEvolved){
            System.out.println("Pokemon evoluido com sucesso!");
        }else {
            System.out.println("O seu pokemon não conseguiu evoluir!");
        }

        System.out.println(romano.getNomeCarta());
        CartaPokemon[] lsc = romano.getCartas().getCartas();
        for(int i=0; i<lsc.length; i++){
            System.out.println(lsc[i].getNome());
            System.out.println("Ataque: " + lsc[i].getATK());
        }

        */

        Jogador luan = new Jogador(new CartaPokemon(TipoPokemon.CHARMELEON), TipoItens.POCAO, 12);

        BatalhaFacade batalha = new BatalhaFacade();
        TipoPokemon pkm1;
        

        batalha.atacar(romano, 5, luan, 2);

        GameManager gm = GameManager.getInstance("Kaique");
        gm.iniciarMenu();

        GameManager gt = GameManager.getInstance("NaoTrocarNome");
        gt.iniciarMenu();
    }
    
}
