package EstructuraLineal;

public class Node {
    private int data;  // Almacena el valor del nodo
    private Node next; // Referencia al siguiente nodo en la lista

    // Constructor de la clase Node
    public Node(int data) {
        this.data = data;  // Inicializa el valor del nodo con el valor proporcionado
        this.next = null;  // Inicializa la referencia al siguiente nodo como nula
    }

    // Getter para obtener el valor del nodo
    public int getData() {
        return data;
    }

    // Setter para establecer el valor del nodo
    public void setData(int data) {
        this.data = data;
    }

    // Getter para obtener la referencia al siguiente nodo
    public Node getNext() {
        return next;
    }

    // Setter para establecer la referencia al siguiente nodo
    public void setNext(Node next) {
        this.next = next;
    }
}
