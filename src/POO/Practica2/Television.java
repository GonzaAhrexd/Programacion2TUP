package POO.Practica2;

public class Television extends Electrodomestico{
    final private float resolucionDefault = 20;
    final private boolean sintonizadorTDTDefault = false;
    private float resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = sintonizadorTDTDefault;
    }

    public Television(float precioBase, float peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = sintonizadorTDTDefault;
    }

    public Television(float resolucion, boolean sintonizadorTDT) {
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }


    public Television(float precioBase, String color, char consumoEnergetico, float peso, float resolucion, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public float getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public float precioFinal() {
        float precioFinal = super.precioFinal();
        if(this.resolucion > 40){
            precioFinal = (precioFinal * 30) /100;
        }
        if(this.sintonizadorTDT){
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return super.toString() + "Television{" +
                "resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                '}';
    }
}
