package interfaceSegregation;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.abrirPortas();
        carro.fecharPortas();
        System.out.println("Velocidade atual do carro: "+ carro.getVelocidade()+" km/h");
        carro.acelerar();
        System.out.println("Velocidade atual do carro: "+ carro.getVelocidade()+" km/h");

        Moto moto = new Moto();
        System.out.println("Velocidade atual da moto: "+ moto.getVelocidade()+" km/h");
        moto.acelerar();
        System.out.println("Velocidade atual da moto: "+ moto.getVelocidade()+" km/h");

    }
}
