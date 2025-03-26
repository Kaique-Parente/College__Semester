package gestao;

import java.util.ArrayList;

public class Secao implements Livro{
    
    private ArrayList<Livro> livros;

    public Secao(){
        this.livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro l){
        this.livros.add(l);
    }

    @Override
    public int calcularLivrosDisponiveis() {
        int total = 0;
        for(Livro l : livros){
            total += l.calcularLivrosDisponiveis();
        }
        return total;
    }

    @Override
    public String getTitulo() {
        String temp = "";

        for(Livro l : livros){
            temp += l.getTitulo() + "\n";
        }

        return temp;
    }

    @Override
    public String getAutor() {
        String temp = "";

        for(Livro l : livros){
            temp += l.getAutor() + "\n";
        }

        return temp;
    }

    @Override
    public boolean isDisponivel() {
        for(Livro l : livros){
            if(l.isDisponivel()){
                return true;
            }
        }
        return false;
    }

}
