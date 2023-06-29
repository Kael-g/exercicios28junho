package dependencyInversion;

import java.util.ArrayList;

public class LivrariaOnline {

    private Envio envio;
    private ArrayList<Livro> catalogo;

    public LivrariaOnline(ArrayList<Livro> catalogo, Envio envio) {
        this.catalogo = catalogo;
        this.envio = envio;
    }

    public void comprarLivro(Livro livro){
        envio.enviarLivro(livro);
    }
}
