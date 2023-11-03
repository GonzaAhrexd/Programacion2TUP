package Parcial;

public class Persona {
    private String nombre_real;
    private String pais;
    private int edad;
    private int vida = 100;

    public Persona(String nombre_real){
        this.nombre_real = nombre_real;
        this.pais = "Sin revelar";
        this.edad = 0;
    }

    public Persona(String nombre_real, String pais, int edad) {
        this.nombre_real = nombre_real;
        this.pais = pais;
        this.edad = edad;
    }

    public String getNombre_real() {
        return nombre_real;
    }

    public void setNombre_real(String nombre_real) {
        this.nombre_real = nombre_real;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
