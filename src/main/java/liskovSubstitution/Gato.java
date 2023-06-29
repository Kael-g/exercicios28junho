package liskovSubstitution;

public class Gato extends Pet{
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void acariciar() {
        System.out.println(getNome() + " está ronronando por receber carinho.");
    }
}
