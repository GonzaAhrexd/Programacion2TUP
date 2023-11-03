package EstructuraLineal;
/**
 * Clase Nodo doble enlazado.
 */
public class DoubleNode {

    public DoubleNode previous;
    public DoubleNode next;
    public String value;


    public DoubleNode(String value) {
        this.previous = null;
        this.next = null;
        this.value = value;
    }

    // toString() retorna el valor del nodo.
    @Override
    public String toString() {
        return this.value;
    }
}