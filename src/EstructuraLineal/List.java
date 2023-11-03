package EstructuraLineal;

public class List {
    private Node first;  // Referencia al primer nodo de la lista
    private int size;    // Tamaño actual de la lista

    // Constructor de la lista
    public List() {
        this.first = null;
        this.size = 0;
    }

    // Getter para obtener el primer nodo de la lista
    public Node getFirst() {
        return first;
    }

    // Setter para establecer el primer nodo de la lista
    public void setFirst(Node first) {
        this.first = first;
    }

    // Getter para obtener el tamaño de la lista
    public int getSize() {
        return size;
    }

    // Setter para establecer el tamaño de la lista
    public void setSize(int size) {
        this.size = size;
    }

    // Método para insertar un nuevo nodo con un valor dado al final de la lista
    public void insertar(int dato) {
        Node nuevo = new Node(dato);

        if (this.first == null) {
            this.first = nuevo;
        } else {
            Node aux = first;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            aux.setNext(nuevo);
        }
        this.size++;
    }

    // Método para eliminar un nodo con un valor dado de la lista
    public void eliminar(int dato) {
        if (this.first != null) {
            if (this.first.getData() == dato) {
                this.first = this.first.getNext();
            } else {
                Node aux = first;
                while (aux.getNext() != null && aux.getNext().getData() != dato) {
                    aux = aux.getNext();
                }

                if (aux.getNext() != null) {
                    aux.setNext(aux.getNext().getNext());
                }
            }
        }
        this.size--;
    }

    public void eliminarUltimoElemento(){
        if(this.first != null) {
            if (this.first.getNext() == null) {
                this.first = null;
            } else {
                Node head = this.first;
                while (head.getNext().getNext() != null) {
                    head  = head.getNext();
                }
                head.setNext(null);
                this.size--;
            }
        }

    }

    // Método para agregar un nuevo nodo con un valor dado en una posición específica
    public void AgregarMedio(int valor, int posicion) {
        Node elemento = new Node(valor);

        if (this.first == null) {
            first = elemento;
            return;
        }
        Node aux = first;
        int indice = 0;
        while (indice < posicion - 1) {
            aux = aux.getNext();
            indice++;
        }
        elemento.setNext(aux.getNext());
        aux.setNext(elemento);
        this.size++;
    }

    // Método para comprobar si la lista está vacía
    public boolean isEmpty() {
        return this.first == null;
    }

    // Método para mostrar todos los elementos de la lista
    public void mostrar() {
        if (isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            Node nodoAux = this.first;
            for (int i = 0; i < this.size; i++) {
                System.out.println(nodoAux.getData());
                nodoAux = nodoAux.getNext();
            }
        }
    }

    // Método para mostrar el elemento en una posición específica de la lista
    public void mostrar(int posicion) {
        if (isEmpty()) {
            System.out.println("Lista vacía");
        } else {
            Node nodoAux = this.first;
            for (int i = 0; i <= posicion; i++) {
                nodoAux = nodoAux.getNext();
            }
            System.out.println(nodoAux.getData());
        }
    }
}
