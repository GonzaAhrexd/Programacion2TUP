package POO.Practica2;

public class Lavarropas extends Electrodomestico{
    final float cargaPorDefecto = 5;
    float carga;

    public Lavarropas(){
        this.carga = cargaPorDefecto;
    }
    public Lavarropas(float precio, float peso){
        super(precio,peso);
        this.carga = cargaPorDefecto;
    }

    public Lavarropas(float precioBase, String color, char consumoEnergetico, float peso, float carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }


    public float getCarga() {
        return carga;
    }
    @Override
    public float precioFinal(){
        if(this.carga > 30){
            return super.precioFinal() + 50;
        }else{
            return super.precioFinal();
        }
    }

    @Override
    public String toString() {
        return super.toString() + "Lavarropas{" +
                "carga=" + carga +
                '}';
    }
}
