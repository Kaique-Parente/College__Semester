package gamemanager;

public class GameManager {
    
    private static GameManager instance;
    private String nomeJogador;

    private GameManager(String nomeJogador){
        this.nomeJogador = nomeJogador;
    }

    public static GameManager getInstance(String nomeJogador){
        if(instance == null){
            instance = new GameManager(nomeJogador);
        }
        return instance;
    }

    public void iniciarMenu(){
        System.out.println("Bem-vindo " + nomeJogador + " ao mundo de Pokemon!");
    }

}
