package PracticaParcial;

public class Delfin extends Animal implements InterfazAnimal {
    private boolean enAgua;

    public Delfin(String altura, String peso, String color) {
        super(altura, peso, color);
        enAgua = true;
    }

    public Delfin(String altura, String peso, String color, Boolean enAgua) {
        super(altura, peso, color);
        this.enAgua = enAgua;
    }

    @Override
    public String makeNoise() {
        return "Ee-ee";
    }



}
