package singleResponsability;

public class Telefone {
    //Atributos
    private String numero;

    //Construtores
    public Telefone(String numero) {
        this.numero = numero;
    }

    //Métodos
    public void fazerLigacao(String numero){
        System.out.println("Ligando para "+numero+"...");
    }

    public void tocar(){
        System.out.println("Chamada recebida");
    }

}
