package exercicio03facto;

public class Laptop implements Produto{
    private String tipo;
    private double precoBase;

    public Laptop(String tipo, double precoBase){
        this.tipo = tipo;
        this.precoBase = precoBase;
    }

    public String getTipo(){
        return tipo;
    }

    @Override
    public double calcularPreco() {
        return precoBase * 1.5;
    }

}
