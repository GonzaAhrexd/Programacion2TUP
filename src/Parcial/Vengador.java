package Parcial;

public class Vengador extends Persona{
    private String nombre_heroe;
    private String[] habilidades;
    private Boolean humano;

    public Vengador(String nombre_real, String nombre_heroe) {
        super(nombre_real);
        this.nombre_heroe = nombre_heroe;
    }
    public Vengador(String nombre_heroe) {
        super("Sin revelar","Desconocido",0);
        this.nombre_heroe = nombre_heroe;
    }

    public Vengador(String nombre_real, String pais, int edad, String nombre_heroe, String[] habilidades, Boolean humano) {
        super(nombre_real, pais, edad);
        this.nombre_heroe = nombre_heroe;
        this.habilidades = habilidades;
        this.humano = humano;
    }
    public Vengador( String nombre_heroe, String pais, int edad, String[] habilidades, Boolean humano) {
        super("Sin revelar", pais, edad);
        this.nombre_heroe = nombre_heroe;
        this.habilidades = habilidades;
        this.humano = humano;
    }

    public String getNombre_heroe() {
        return nombre_heroe;
    }

    public void setNombre_heroe(String nombre_heroe) {
        this.nombre_heroe = nombre_heroe;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }

    public Boolean getHumano() {
        return humano;
    }

    public void setHumano(Boolean humano) {
        this.humano = humano;
    }

    public String Atacar(){
        return this.nombre_heroe + " está atacando";
    }

    public String Atacar(Arma arma){
        return this.nombre_heroe + " esta atacando con un " + arma;
    }

    public String Defender(){
        return this.nombre_heroe + " está defendiendo";
    }



}
