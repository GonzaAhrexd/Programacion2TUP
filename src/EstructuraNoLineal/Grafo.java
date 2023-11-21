package EstructuraNoLineal;

import EstructuraLineal.List;

import java.util.ArrayList;

public class Grafo {

    private int[][] matrizPesos;
    private String[] vertices;

    private int[][] matrizAdyacencia;

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

    public Grafo(String[] vertices) {
        this.vertices = vertices;
        this.matrizPesos = new int[vertices.length][vertices.length];
        this.matrizAdyacencia = new int[vertices.length][vertices.length];
    }


    public void conectar(String v1, String v2, int peso) {

        int index1 = busquedaIndex(v1);
        int index2 = busquedaIndex(v2);
        conectar(v1, v2);

        if (index1 != -1 && index2 != -1) {
            matrizPesos[index1][index2] = peso;
            matrizPesos[index2][index1] = peso;
        }
    }

    public void conectar(String v1, String v2) {

        int index1 = busquedaIndex(v1);
        int index2 = busquedaIndex(v2);

        if (index1 != -1 && index2 != -1) {
            this.matrizAdyacencia[index1][index2] = 1;
            this.matrizAdyacencia[index2][index1] = 1;
        }
    }

    public void imprimirAdyacencia() {
        System.out.print(" ");
        for (String valores : this.vertices) {
            System.out.print(" " + valores);
        }
        System.out.println(" ");
        for (int i = 0; i < matrizAdyacencia.length; i++) {

            System.out.print(vertices[i] + " ");
            for (int j = 0; j < matrizAdyacencia.length; j++) {
                System.out.print(matrizAdyacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void imprimirPesos() {
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


    public void nodosAdyacentes(String nodo) {
        int indiceNodo = busquedaIndex(nodo);

        for (int i = 0; i < vertices.length; i++) {
            if (this.matrizAdyacencia[indiceNodo][i] == 1) {
                System.out.print(this.vertices[i] + " ");

            }
        }
    }

    public void eliminarConexion(String v1, String v2) {
        int index1 = busquedaIndex(v1);
        int index2 = busquedaIndex(v2);

        if (index1 != -1 && index2 != -1) {
            // Elimina la conexión estableciendo el peso a cero
            matrizPesos[index1][index2] = 0;
            matrizPesos[index2][index1] = 0;

            matrizAdyacencia[index1][index2] = 0;
            matrizAdyacencia[index2][index1] = 0;

            System.out.println("Conexión entre " + v1 + " y " + v2 + " eliminada.");
        } else {
            System.out.println("Vértice no existente");
        }
    }

    private String[] verticesVisitados;
    private int[] distancias;

    public void imprimirProfundidad() {
        verticesVisitados = new String[vertices.length];
        distancias = new int[vertices.length];

        // Inicializar arrays
        for (int i = 0; i < vertices.length; i++) {
            verticesVisitados[i] = "NO_VISITADO";
            distancias[i] = -1; // Valor sentinela para indicar que no se ha visitado
        }

        // Comienza a recorrer los vértices
        for (int i = 0; i < vertices.length; i++) {
            if (verticesVisitados[i].equals("NO_VISITADO")) {
                profundidadVisitar(i, 0); // Iniciar la profundidad con una distancia de 0
            }
        }
    }

    // Método interno para realizar recorrido en profundidad recursivo
    private void profundidadVisitar(int nodoIndice, int distanciaActual) {
        // Marco el nodo como visitado
        verticesVisitados[nodoIndice] = "VISITADO";

        // Imprimo el valor del vértice
        System.out.println("Nodo: " + vertices[nodoIndice] + ", Distancia: " + distanciaActual);

        // Actualizo la distancia actual
        distancias[nodoIndice] = distanciaActual;

        int[] vecinos = matrizPesos[nodoIndice];

        for (int i = 0; i < vecinos.length; i++) {
            // Si es un vecino y no ha sido visitado
            if (vecinos[i] > 0 && verticesVisitados[i].equals("NO_VISITADO")) {
                profundidadVisitar(i, distanciaActual + vecinos[i]); // Llamada recursiva con la distancia actualizada
            }
        }
    }
    private void calcularDistancias() {
        verticesVisitados = new String[vertices.length];
        distancias = new int[vertices.length];

        // Inicializar arrays
        for (int i = 0; i < vertices.length; i++) {
            verticesVisitados[i] = "NO_VISITADO";
            distancias[i] = -1; // Valor sentinela para indicar que no se ha visitado
        }

        // Comienza a recorrer los vértices
        for (int i = 0; i < vertices.length; i++) {
            if (verticesVisitados[i].equals("NO_VISITADO")) {
                profundidadCalcularDistancias(i, 0); // Iniciar la profundidad con una distancia de 0
            }
        }
    }

    // Método interno para calcular distancias en recorrido en profundidad recursivo
    private void profundidadCalcularDistancias(int nodoIndice, int distanciaActual) {
        // Marco el nodo como visitado
        verticesVisitados[nodoIndice] = "VISITADO";

        // Actualizo la distancia actual
        distancias[nodoIndice] = distanciaActual;

        int[] vecinos = matrizPesos[nodoIndice];

        for (int i = 0; i < vecinos.length; i++) {
            // Si es un vecino y no ha sido visitado
            if (vecinos[i] > 0 && verticesVisitados[i].equals("NO_VISITADO")) {
                profundidadCalcularDistancias(i, distanciaActual + vecinos[i]); // Llamada recursiva con la distancia actualizada
            }
        }
    }

    public int distanciaEntreNodosProfundidad(String origen, String destino) {
        int indexOrigen = busquedaIndex(origen);
        int indexDestino = busquedaIndex(destino);

        if (indexOrigen == -1 || indexDestino == -1) {
            System.out.println("Vértices no existentes.");
            return -1; // Valor sentinela para indicar que los vértices no existen
        }

        // Realizamos el recorrido en profundidad si no se ha realizado antes
        if (verticesVisitados == null || distancias == null || verticesVisitados.length != vertices.length || distancias.length != vertices.length) {
            calcularDistancias();
        }

        // Retornamos la distancia almacenada en la posición del índice del destino
        return distancias[indexDestino];
    }

    public void eliminarNodo(String nodo) {
        int indiceNodo = busquedaIndex(nodo);

        if (indiceNodo != -1) {
            // Crear nuevas matrices con un tamaño reducido
            String[] nuevosVertices = new String[vertices.length - 1];
            int[][] nuevaMatrizAdyacencia = new int[vertices.length - 1][vertices.length - 1];
            int[][] nuevaMatrizPesos = new int[vertices.length - 1][vertices.length - 1];

            int nuevoIndice = 0;
            for (int i = 0; i < vertices.length; i++) {
                if (i != indiceNodo) {
                    nuevosVertices[nuevoIndice] = vertices[i];
                    nuevoIndice++;
                }
            }

            int nuevoI = 0, nuevoJ;
            for (int i = 0; i < vertices.length; i++) {
                if (i != indiceNodo) {
                    nuevoJ = 0;
                    for (int j = 0; j < vertices.length; j++) {
                        if (j != indiceNodo) {
                            nuevaMatrizAdyacencia[nuevoI][nuevoJ] = matrizAdyacencia[i][j];
                            nuevaMatrizPesos[nuevoI][nuevoJ] = matrizPesos[i][j];
                            nuevoJ++;
                        }
                    }
                    nuevoI++;
                }
            }

            // Asignar las nuevas matrices y vértices
            vertices = nuevosVertices;
            matrizAdyacencia = nuevaMatrizAdyacencia;
            matrizPesos = nuevaMatrizPesos;
        }
    }


    public void recorrerDFS(String inicio) {
        int indiceInicio = busquedaIndex(inicio);
        boolean[] visitado = new boolean[vertices.length];
        recorrerDFSUtil(indiceInicio, visitado);
    }

    private void recorrerDFSUtil(int nodo, boolean[] visitado) {
        visitado[nodo] = true;
        System.out.print(vertices[nodo] + " ");

        for (int i = 0; i < vertices.length; i++) {
            if (matrizAdyacencia[nodo][i] == 1 && !visitado[i]) {
                recorrerDFSUtil(i, visitado);
            }
        }
    }

    public int pesoDeNodoANodo(String inicio, String destino) {
        int indiceInicio = busquedaIndex(inicio);
        int indiceDestino = busquedaIndex(destino);

        if (indiceInicio != -1 && indiceDestino != -1) {
            return dijkstra(indiceInicio, indiceDestino);
        } else {
            // Retornar algún valor que indique que no hay conexión o nodos incorrectos
            return -1;
        }
    }

    private int dijkstra(int inicio, int destino) {
        int cantidadNodos = matrizPesos.length;
        int[] distancias = new int[cantidadNodos];
        boolean[] visitados = new boolean[cantidadNodos];

        for (int i = 0; i < cantidadNodos; i++) {
            distancias[i] = Integer.MAX_VALUE;
            visitados[i] = false;
        }

        distancias[inicio] = 0;

        for (int count = 0; count < cantidadNodos - 1; count++) {
            int u = minimaDistancia(distancias, visitados);
            visitados[u] = true;

            for (int v = 0; v < cantidadNodos; v++) {
                if (!visitados[v] && matrizPesos[u][v] != 0 && distancias[u] != Integer.MAX_VALUE &&
                        distancias[u] + matrizPesos[u][v] < distancias[v]) {
                    distancias[v] = distancias[u] + matrizPesos[u][v];
                }
            }
        }

        return distancias[destino];
    }

    private int minimaDistancia(int[] distancias, boolean[] visitados) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int v = 0; v < distancias.length; v++) {
            if (!visitados[v] && distancias[v] <= min) {
                min = distancias[v];
                minIndex = v;
            }
        }

        return minIndex;
    }

}





