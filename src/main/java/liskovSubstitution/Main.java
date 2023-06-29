package liskovSubstitution;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<>();
        pets.add(new Gato("Snowbell"));
        pets.add(new Cachorro("Bethoven"));

        for (Pet pet : pets){
            pet.acariciar();
        }
    }
}
