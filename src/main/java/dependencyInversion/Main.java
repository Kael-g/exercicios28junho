package dependencyInversion;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Livro livro = new Livro("O Tempo É Relativo", "Alguém");

        LivrariaOnline livrariaOnline = new LivrariaOnline(livro);

        livrariaOnline.comprarLivro(livro);



    }
}