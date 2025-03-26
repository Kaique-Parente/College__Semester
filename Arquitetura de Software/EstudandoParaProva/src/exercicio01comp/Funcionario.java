package exercicio01comp;

public class Funcionario implements FolhaPagamento{

    private double salario;

    public Funcionario(){
        this.salario = 1200;
    }

    @Override
    public double calcularFolhaPagamento() {
        return salario;
    }
    
}
