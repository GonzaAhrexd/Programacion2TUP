package PracticaParcial;

public class Gato extends Animal implements InterfazAnimal{

    private String raza;
    public Gato(String altura, String peso, String color, String raza) {
        super(altura, peso, color);
        this.raza = raza;
        super.setHabitat("Ciudad");
        super.setVertebrado(Boolean.TRUE);
        super.setClasificacion("Mamifero");

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String makeNoise(){
        return "Miau";
    }

    public String makeNoise(boolean angry){
        return angry ? "MIAU!!!" : "Miau :c";
    }

}
