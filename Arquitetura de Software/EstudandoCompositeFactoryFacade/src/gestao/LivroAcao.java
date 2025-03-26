package gestao;

public class LivroAcao implements Livro{
    
    private String titulo;
    private String autor;
    private boolean disponivel;

    public LivroAcao(String titulo, String autor, boolean disponivel){
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    @Override
    public int calcularLivrosDisponiveis() {
        return 1;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public boolean isDisponivel() {
        return this.disponivel;
    }
}
