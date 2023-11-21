package EstructuraNoLineal;
import EstructuraLineal.List;

public class GrafoLista {
    private int[][] matrizPesos;
    private String[] vertices;

    private List listaAdyacencia = new List();
    public int[][] getMatrizPesos() {
        return matrizPesos;
    }

    public void setMatrizPesos(int[][] matrizPesos) {
        this.matrizPesos = matrizPesos;
    }

    public String[] getVertices() {
        return vertices;
    }

    public void setVertices(String[] vertices) {
        this.vertices = vertices;
    }


    public GrafoLista(int[][] matrizPesos, String[] vertices, List listaAdyacencia) {
        this.matrizPesos = new int[vertices.length][vertices.length];;
        this.vertices = vertices;
        this.listaAdyacencia = listaAdyacencia;
    }

    public void conectar(String v1, String v2, int peso) {

        int index1 = busquedaIndex(v1);
        int index2 = busquedaIndex(v2);

        if (index1 != -1 && index2 != -1) {
            matrizPesos[index1][index2] = peso;
            matrizPesos[index2][index1] = peso;
        }
    }

    public void imprimir() {
        for (int i = 0; i < matrizPesos.length; i++) {
            for (int j = 0; j < matrizPesos.length; j++) {
                System.out.print(matrizPesos[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int busquedaIndex(String v) {
        int resultado = -1;

        for (int i = 0; i < vertices.length; i++) {
            if (vertices[i].equals(v)) {
                resultado = i;
                break;
            }
        }

        return resultado;
    }
}
