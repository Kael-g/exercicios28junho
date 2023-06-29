package interfaceSegregation;

public class Carro implements Portas, Acelerador{
    private int velocidade;

    public Carro() {
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public void acelerar() {
        velocidade += 10;
    }

    @Override
    public void abrirPortas() {
        System.out.println("Portas abertas");
    }

    @Override
    public void fecharPortas() {
        System.out.println("Portas fechadas");
    }
}
