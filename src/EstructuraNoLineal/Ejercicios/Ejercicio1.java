package EstructuraNoLineal.Ejercicios;

import EstructuraNoLineal.Grafo;

import java.sql.SQLOutput;

public class Ejercicio1 {
    public static void main(String[] args) {


        String[] contenido = {"A", "B", "C", "D", "E", "F", "G"};
        //                     0    1    2    3    4    5    6   7   8   9
        Grafo miGrafo = new Grafo(contenido);
        //A

        miGrafo.conectar("A","B",2);
        miGrafo.conectar("A","C",4);
        miGrafo.conectar("A","D",3);

        //B
        miGrafo.conectar("B","E",7);
        miGrafo.conectar("B","F",4);
        miGrafo.conectar("B","G",6);

        //C
        miGrafo.conectar("C","E",3);
        miGrafo.conectar("C","G",4);
        miGrafo.conectar("C","F",2);



        miGrafo.eliminarNodo("C");

        miGrafo.imprimirAdyacencia();

        System.out.println(miGrafo.pesoDeNodoANodo("A","F"));
    }

}
