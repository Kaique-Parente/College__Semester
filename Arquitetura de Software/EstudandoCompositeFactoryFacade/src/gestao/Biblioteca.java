package gestao;

import java.util.ArrayList;

public class Biblioteca{
    
    ArrayList<Livro> livros;

    public Biblioteca(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro l){
        this.livros.add(l);
    }

    public int calcularLivrosDisponiveis(){
        int total = 0;

        for(Livro l: livros){
            total += l.calcularLivrosDisponiveis();
        }

        return total;
    }

}
