package exercicio03facto;

public class Tablet implements Produto{
    private String tipo;
    private double precoBase;

    public Tablet(String tipo, double precoBase){
        this.tipo = tipo;
        this.precoBase = precoBase;
    }

    public String getTipo(){
        return this.tipo;
    }

    @Override
    public double calcularPreco() {
        return precoBase * 1.3;
    }

}
