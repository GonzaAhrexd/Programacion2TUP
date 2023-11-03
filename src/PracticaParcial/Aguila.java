package PracticaParcial;

public class Aguila extends Animal implements InterfazAnimal{

    private boolean volando;
    public Aguila(String altura, String peso, String color) {
        super(altura, peso, color);
    }

    public Aguila(String altura, String peso, String color, Boolean volando) {
        super(altura, peso, color);
        this.volando = volando;
    }

    @Override
    public String makeNoise() {
        return "Fiuuuuu";
    }
}
