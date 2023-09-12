package POO.Animales;

import POO.Animales.Animal;

public class Gato extends Animal {
    public Gato(String img) {
        super("Gato", img, "Domesticable", "Casa");
    }
    //Sobrecarga de métodos
    public String comer(){
        return "Gato " + super.comer();

    }
    public String comer(String comida){
        return "Gato " + super.comer() + comida;

    }

}
