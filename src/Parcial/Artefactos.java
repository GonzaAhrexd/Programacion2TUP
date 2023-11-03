package Parcial;

public abstract class Artefactos {
    private String nombre;
    private String tipo;
    private String[] materiales;

    private String origen;
    private double durabilidad;

    public Artefactos(String nombre, String tipo, String[] materiales, String origen, int durabilidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.materiales = materiales;
        this.origen = origen;
        this.durabilidad = durabilidad;
    }

    public Artefactos(String tipo, String[] materiales, String origen, int durabilidad) {
        this.nombre = "Sin nombrar";
        this.tipo = tipo;
        this.materiales = materiales;
        this.origen = origen;
        this.durabilidad = durabilidad;
    }
    public Artefactos(String tipo, String[] materiales, int durabilidad) {
        this.nombre = "Sin nombrar";
        this.tipo = tipo;
        this.materiales = materiales;
        this.origen = "Desconocido";
        this.durabilidad = durabilidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getMateriales() {
        return materiales;
    }

    public void setMateriales(String[] materiales) {
        this.materiales = materiales;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public double getDurabilidad() {
        return durabilidad;
    }

    public void setDurabilidad(double durabilidad) {
        this.durabilidad = durabilidad;
    }

    public abstract void receive_damage(double cantidad);
}
