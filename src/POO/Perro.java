package POO;

public class Perro extends Animal {

    public Perro(String img){
        super("Perro",img,"Domesticable","Casa");
    }

    @Override
    public String comer(){
        return "Perro " + super.comer();
    }
}
