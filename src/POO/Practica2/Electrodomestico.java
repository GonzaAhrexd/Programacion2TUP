package POO.Practica2;

import java.util.Objects;

public class Electrodomestico {
    final private char consumoDefault = 'F';
    final private String colorDefault = "Blanco";
    private float precioBase;
    private float peso;
    private String color;
    private char consumoEnergetico;
    public Electrodomestico() {
        this.precioBase = 100;
        this.color = colorDefault;
        this.consumoEnergetico = consumoDefault;
        this.peso = 5;
    }
    public Electrodomestico(float precioBase, float peso) {
        this.precioBase = precioBase;
        this.color = colorDefault;
        this.consumoEnergetico = consumoDefault;
        this.peso = peso;
    }
    public Electrodomestico(float precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }
    public float getPrecioBase() {
        return precioBase;
    }
    public String getColor() {
        return color;
    }
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }
    public float getPeso() {
        return peso;
    }
    private void comprobarConsumoEnergetico(char letra){
        if(letra >= 'A' && letra <= 'F' ){
            this.consumoEnergetico = letra;
        }else{
            this.consumoEnergetico = consumoDefault;
        }
    }

    private void comprobarColor(String color){
        String[] coloresDisponibles = {"blanco", "negro", "rojo", "azul", "gris"};
        for (String colores : coloresDisponibles) {
            if(color.equalsIgnoreCase(colores)){
                this.color = color;
            }else{
                this.color = colorDefault;
            }

        }
    }

    public float precioFinal(){
        float precioFinal = precioBase;
        if(this.consumoEnergetico == 'A'){
            precioFinal += 100;
        }else if(this.consumoEnergetico == 'B'){
            precioFinal += 80;
        }else if (this.consumoEnergetico == 'C') {
            precioFinal += 60;
        }else if (this.consumoEnergetico == 'D') {
            precioFinal += 50;
        }else if (this.consumoEnergetico == 'E') {
            precioFinal += 30;
        }else if (this.consumoEnergetico == 'F') {
            precioFinal += 10;
        }

        if(this.peso >= 0 && this.peso <= 20){
            precioFinal += 10;
        }else if(this.peso >= 20 && this.peso <= 49){
            precioFinal += 50;
        }else if(this.peso >= 50 && this.peso <= 79){
            precioFinal += 80;
        }else if(this.peso >= 80){
            precioFinal += 10;
        }


        return precioFinal;
    }



    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                '}';
    }
}
