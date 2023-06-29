package liskovSubstitution;

public class Pet {
    //Atributos
    private String nome;

    //Construtores

    public Pet(String nome) {
        this.nome = nome;
    }


    //Metodos

    public String getNome() {
        return nome;
    }

    public void acariciar(){
        System.out.println(nome + "está feliz de receber carinho!");
    }
}
