package dependencyInversion;

import java.util.ArrayList;

public class LivrariaOnline {

    private Envio envio;

    public LivrariaOnline(Envio envio) {
        this.envio = envio;
    }

    public void comprarLivro(Livro livro){
        livro.enviarLivro();
    }
}
