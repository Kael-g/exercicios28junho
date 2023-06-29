package dependencyInversion;

public class LivroFisico extends Livro implements Envio{
    public LivroFisico(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    public void enviarLivro(Livro livro) {
        System.out.println("Enviando livro para o endereço do comprador...");
    }
}
