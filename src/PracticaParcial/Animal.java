package PracticaParcial;

public abstract class Animal{
    private String altura;
    private String peso;
    private String color;
    private String habitat;
    private Boolean Vertebrado;
    private String clasificacion;

    public Animal(String altura, String peso, String color) {
        this.altura = altura;
        this.peso = peso;
        this.color = color;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Boolean getVertebrado() {
        return Vertebrado;
    }

    public void setVertebrado(Boolean vertebrado) {
        Vertebrado = vertebrado;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }
}
