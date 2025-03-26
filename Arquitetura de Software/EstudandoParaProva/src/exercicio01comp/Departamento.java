package exercicio01comp;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<FolhaPagamento> lista;

    public Departamento(String nome){
        this.nome = nome;
        this.lista = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }

    public void adicionarFuncionario(FolhaPagamento f){
        lista.add(f);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for(FolhaPagamento f : lista){
            total += f.calcularFolhaPagamento();
        }
        return total;
    }
}
