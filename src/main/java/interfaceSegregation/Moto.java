package interfaceSegregation;

public class Moto implements Acelerador{
    private int velocidade;

    public Moto() {
        this.velocidade = 0;
    }

    public int getVelocidade() {
        return velocidade;
    }

    @Override
    public void acelerar() {
        velocidade += 8;
    }
}
