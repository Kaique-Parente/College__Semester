package gamemanager;

import cartaspokemon.TipoPokemon;
import jogador.Jogador;

public class BatalhaFacade {
    public void atacar(Jogador jg1, int dano, Jogador jg2, int def){
        System.out.println("O " + jg1.getNomeCarta() + " tem " + jg1.getHp() + " de vida!");
        System.out.println("O " + jg2.getNomeCarta() + " tem " + jg2.getHp() + " de vida!");

        System.out.println("-----------------------------");
        
        jg2.setHp(jg2.getHp() - dano + def);

        System.out.println("O " + jg1.getNomeCarta() + " Atacou o " + jg2.getNomeCarta());
        System.out.println("O " + jg2.getNomeCarta() + " tem " + jg2.getHp() + " de vida!");
    }
}
