package gestao;

public interface Livro {
    
    int calcularLivrosDisponiveis();
    String getTitulo();
    String getAutor();
    boolean isDisponivel();
}
