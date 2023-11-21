package EstructuraNoLineal.Ejercicios;

import EstructuraNoLineal.*;

public class Ejercicio3 {

    public static void main(String[] args) {
        String[] grafoNodos = {"1", "2", "3", "4", "5"};
        Grafo nuevoGrafo = new Grafo(grafoNodos);
        Grafo otroGrafo = new Grafo(grafoNodos);

        //Grafo A
        nuevoGrafo.conectar("2","1",4);
        nuevoGrafo.conectar("2","3",5);
        nuevoGrafo.conectar("2","5",3);
        nuevoGrafo.conectar("5","4",2);
        nuevoGrafo.conectar("4","1",5);
        System.out.println("Grafo A");
        nuevoGrafo.imprimirPesos();

        otroGrafo.conectar("1","2");
        otroGrafo.conectar("2","3");
        otroGrafo.conectar("4","5");

        System.out.println("Grafo B");
        otroGrafo.imprimirAdyacencia();


        System.out.println("Nodos");
        nuevoGrafo.nodosAdyacentes("1");


    }

}
