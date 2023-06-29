package liskovSubstitution;

public class Cachorro extends Pet {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void acariciar() {
        System.out.println(getNome()+" está balançando o rabo por receber carinho.");
    }
}
