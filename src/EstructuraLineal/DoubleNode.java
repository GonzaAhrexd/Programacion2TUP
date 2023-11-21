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

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}