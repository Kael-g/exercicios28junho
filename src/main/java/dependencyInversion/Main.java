package dependencyInversion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Livro livroFisico = new LivroFisico("AAAAAAAAAAAAAAAAAAA", "Desconhecido e desesperado");
        Livro ebook = new Ebook("Precisamos ter esperança", "Aristóteles");

        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livroFisico);
        livros.add(ebook);


        LivrariaOnline livrariaOnline = new LivrariaOnline(livros);
        livrariaOnline.comprarLivro(ebook);
        livrariaOnline.comprarLivro(livroFisico);


    }
}