package EstructuraNoLineal;

public class main {
    public static void main(String[] args) {
        String[] contenido = {"A", "B", "C", "D", "E", "F", "G","H","I","J"};
        //                     0    1    2    3    4    5    6   7   8   9
        Grafo miGrafo = new Grafo(contenido);
        //A
        miGrafo.conectar(contenido[0], contenido[1], 2);
        miGrafo.conectar(contenido[0], contenido[2], 4);
        miGrafo.conectar(contenido[0], contenido[3], 5);

        //B
        miGrafo.conectar(contenido[1], contenido[4], 7);
        miGrafo.conectar(contenido[1], contenido[5], 4);
        miGrafo.conectar(contenido[1], contenido[6], 6);

        //C
        miGrafo.conectar(contenido[2], contenido[4], 3);
        miGrafo.conectar(contenido[2], contenido[5], 2);
        miGrafo.conectar(contenido[2], contenido[6], 4);

        //D
        miGrafo.conectar(contenido[3], contenido[4], 4);
        miGrafo.conectar(contenido[3], contenido[5], 1);
        miGrafo.conectar(contenido[3], contenido[6], 5);

        //E
        miGrafo.conectar(contenido[4], contenido[7],3);
        miGrafo.conectar(contenido[4], contenido[8], 4);
        //F
        miGrafo.conectar(contenido[5], contenido[7], 6);
        miGrafo.conectar(contenido[5], contenido[8], 3);
        //G
        miGrafo.conectar(contenido[6], contenido[7], 3);
        miGrafo.conectar(contenido[6], contenido[8], 3);
        //H
        miGrafo.conectar(contenido[7], contenido[9], 3);
        miGrafo.conectar(contenido[8], contenido[9], 4);


        miGrafo.imprimirPesos();
        for (String cont : miGrafo.getVertices()) {
            System.out.println(cont);
        }

    }
}
