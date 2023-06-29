package singleResponsability;

public class Pessoa {
    private String nome;
    private Telefone telefone;

    public Pessoa(String nome, Telefone telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public void chamar(){
        String numero = "3333-0000";
        telefone.fazerLigacao(numero);
    }

    public void atender(){
        telefone.tocar();
        System.out.println("Alô");
    }

}
