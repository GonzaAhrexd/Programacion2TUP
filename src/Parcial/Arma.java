package Parcial;

public class Arma extends Artefactos{

    private int poder_de_ataque;

    private boolean vibranium;

    public Arma(String nombre, String tipo, String[] materiales, String origen, int durabilidad, int poder_de_ataque, boolean vibranium) {
        super(nombre, tipo, materiales, origen, durabilidad);
        this.poder_de_ataque = poder_de_ataque;
        this.vibranium = vibranium;
    }
    public Arma(String nombre, String tipo, String[] materiales, String origen, int durabilidad, int poder_de_ataque) {
        super(nombre, tipo, materiales, origen, durabilidad);
        this.poder_de_ataque = poder_de_ataque;
        this.vibranium = false;
    }
    public Arma(String tipo, String[] materiales, String origen, int durabilidad, int poder_de_ataque, boolean vibranium) {
        super(tipo, materiales, origen, durabilidad);
        this.poder_de_ataque = poder_de_ataque;
        this.vibranium = vibranium;
    }

    public Arma(String tipo, String[] materiales, int durabilidad, int poder_de_ataque, boolean vibranium) {
        super(tipo, materiales, durabilidad);
        this.poder_de_ataque = poder_de_ataque;
        this.vibranium = vibranium;
    }

    public int getPoder_de_ataque() {
        return poder_de_ataque;
    }

    public void setPoder_de_ataque(int poder_de_ataque) {
        this.poder_de_ataque = poder_de_ataque;
    }

    public boolean isVibranium() {
        return vibranium;
    }

    public void setVibranium(boolean vibranium) {
        this.vibranium = vibranium;
    }

    public void receive_damage(double cantidad){
        if(this.isVibranium()){
            System.out.println("No se puede recibir daño porque está siendo protegido por el vibranium");
        }else{
            super.setDurabilidad(super.getDurabilidad() - cantidad);
        }

    }

}
