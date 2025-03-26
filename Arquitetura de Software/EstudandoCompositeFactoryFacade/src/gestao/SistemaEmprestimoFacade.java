package gestao;

public class SistemaEmprestimoFacade {

    private Biblioteca biblioteca;

    public SistemaEmprestimoFacade(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public int calcularLivrosDisponiveis(){
        return biblioteca.calcularLivrosDisponiveis();
    }

}
