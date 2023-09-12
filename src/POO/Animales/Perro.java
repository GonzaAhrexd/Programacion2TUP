package POO.Animales;

import POO.Animales.Animal;

public class Perro extends Animal {

    public Perro(String img){
        super("Perro",img,"Domesticable","Casa");
    }

    @Override
    public String comer(){
        return "Perro " + super.comer();
    }
}
