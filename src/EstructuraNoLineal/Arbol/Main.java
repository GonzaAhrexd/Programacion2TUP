package EstructuraNoLineal.Arbol;

public class Main {
    public static void main(String[] args) {


     recorrerInOrden();
    }

    private static void recorrerInOrden() {
        /* Se crea el siguiente arbol en memoria
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */

        NodoABinario nodo50 = new NodoABinario("50");
        NodoABinario nodo30 = new NodoABinario("30");
        NodoABinario nodo70 = new NodoABinario("70");
        NodoABinario nodo20 = new NodoABinario("20");
        NodoABinario nodo40 = new NodoABinario("40");
        NodoABinario nodo60 = new NodoABinario("60");
        NodoABinario nodo80 = new NodoABinario("80");

        nodo50.izq = nodo30;
        nodo50.der = nodo70;

        nodo30.izq = nodo20;
        nodo30.der = nodo40;

        nodo70.izq = nodo60;
        nodo70.der = nodo80;

        ArbolBinario ab = new ArbolBinario();
        ab.construir(nodo50);

        ab.imprimirInOrder();
    }

}

