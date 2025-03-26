package exercicio03facto;

public class ProductFactory {
    public static Produto criarProduto(String tipo, double precoBase){
        switch(tipo) {
            case "Celular": return new Celular(tipo, precoBase);
            case "Tablet": return new Tablet(tipo, precoBase);
            case "Laptop": return new Laptop(tipo, precoBase);
            default:
                return null;
        }
    }
}
