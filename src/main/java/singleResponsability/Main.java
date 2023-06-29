package singleResponsability;

public class Main {
    public static void main(String[] args) {
        Telefone telefone = new Telefone("99999-9999");
        Pessoa pessoa = new Pessoa("Juca", telefone);
        pessoa.chamar();
        pessoa.atender();
    }
}
