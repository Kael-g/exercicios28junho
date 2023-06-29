package dependencyInversion;

public class Ebook extends Livro implements Envio{
    public Ebook(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void enviarLivro(Livro livro) {
        System.out.println("Enviando livro para o e-mail do comprador...");
    }
}
