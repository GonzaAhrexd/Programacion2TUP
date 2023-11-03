package Parcial;

public class Vehiculos extends Artefactos{


    private boolean volador;
    private boolean blindado;
    private float velocidad;


    public Vehiculos(String nombre, String tipo, String[] materiales, String origen, int durabilidad, boolean volador, boolean blindado, float velocidad) {
        super(nombre, tipo, materiales, origen, durabilidad);
        this.volador = volador;
        this.blindado = blindado;
        this.velocidad = velocidad;
    }

    public Vehiculos(String nombre, String tipo, String[] materiales, String origen, int durabilidad, boolean volador, float velocidad) {
        super(nombre, tipo, materiales, origen, durabilidad);
        this.volador = volador;
        this.blindado = false;
        this.velocidad = velocidad;

    }

    public Vehiculos(String tipo, String[] materiales, String origen, int durabilidad, boolean volador, boolean blindado, float velocidad) {
        super(tipo, materiales, origen, durabilidad);
        this.volador = volador;
        this.blindado = blindado;
        this.velocidad = velocidad;
    }

    public Vehiculos(String tipo, String[] materiales, int durabilidad, boolean volador, boolean blindado, float velocidad) {
        super(tipo, materiales, durabilidad);
        this.volador = volador;
        this.blindado = blindado;
        this.velocidad = velocidad;
    }

    public boolean isVolador() {
        return volador;
    }

    public void setVolador(boolean volador) {
        this.volador = volador;
    }

    public boolean isBlindado() {
        return blindado;
    }

    public void setBlindado(boolean blindado) {
        this.blindado = blindado;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public void receive_damage(double cantidad) {
        if(this.isBlindado()){
            super.setDurabilidad(super.getDurabilidad() - (cantidad - cantidad * 0.6) );
        }else{
            super.setDurabilidad(super.getDurabilidad() - cantidad);
        }
    }
}
