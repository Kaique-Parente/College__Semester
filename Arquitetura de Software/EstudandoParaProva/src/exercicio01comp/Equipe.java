package exercicio01comp;

import java.util.ArrayList;

public class Equipe implements FolhaPagamento{

    private double salario;
    private ArrayList<FolhaPagamento> lista;

    public Equipe(){
        this.salario = 5000;
        lista = new ArrayList<>();
    }

    public void adicionarFuncionario(FolhaPagamento f){
        lista.add(f);
    }

    @Override
    public double calcularFolhaPagamento() {
        double total = salario;
        for(FolhaPagamento f : lista){
            total += f.calcularFolhaPagamento();
        }
        return total;
    }
    
}
