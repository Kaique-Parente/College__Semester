package gestao;

public class LivroFactory {
    public static Livro criarLivro(int escolha, String titulo, String autor, boolean disponivel){
        switch(escolha){
            case 1 : return new LivroFiccao(titulo, autor, disponivel);
            case 2 : return new LivroAcao(titulo, autor, disponivel);
            case 3 : return new LivroRomance(titulo, autor, disponivel);
            default : 
                System.out.println("Escolha incorreta!");
                return null;
        }
    }
}
