package exercicio02facad;

public class PedidoFacade {
    private Preparar preparar;
    private Cozinhar cozinhar;
    private Embalar embalar;

    public PedidoFacade(){
        this.preparar = new Preparar();
        this.cozinhar = new Cozinhar();
        this.embalar = new Embalar();
    }

    public void realizarPedido(){
        preparar.executar();
        cozinhar.executar();
        embalar.executar();
    }
}
