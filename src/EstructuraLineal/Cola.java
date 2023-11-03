package EstructuraLineal;

public class Cola {

    private Node primero;  // Referencia al primer elemento de la cola
    private Node ultimo;   // Referencia al último elemento de la cola
    private int size;      // Tamaño actual de la cola

    // Constructor de la cola
    public Cola() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    public Node getPrimero() {
        return primero;
    }

    public void setPrimero(Node primero) {
        this.primero = primero;
    }

    public Node getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node ultimo) {
        this.ultimo = ultimo;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    // Comprueba si la cola está vacía
    public boolean isEmpty() {
        return this.primero == null;
    }

    // Método para agregar un elemento (enqueue) a la cola
    public void enqueue(int valor) {

        Node nuevo = new Node(valor);  // Crea un nuevo nodo con el valor dado

        if (isEmpty()) {
            // Si la cola está vacía, el nuevo nodo se convierte en el primer y último elemento
            this.primero = nuevo;
            this.ultimo = nuevo;
        } else {
            // Si la cola no está vacía, el nuevo nodo se agrega al final de la cola
            this.ultimo.setNext(nuevo);
            this.ultimo = nuevo;  // Actualiza el puntero "ultimo" al nuevo nodo
        }
        this.size++;  // Incrementa el tamaño de la cola
    }

    // Método para eliminar un elemento (dequeue) de la cola y devuelve su valor
    public int dequeue() {

        if (isEmpty()) {
            return 0;  // Si la cola está vacía, devuelve 0 o algún valor predeterminado
        } else {

            int aux = this.primero.getData();  // Obtiene el valor del primer elemento
            this.primero = this.primero.getNext();  // Actualiza el puntero "primero" al siguiente nodo
            this.size--;  // Decrementa el tamaño de la cola

            return aux;  // Devuelve el valor del elemento eliminado
        }
    }

    public int getElement(){
        if(isEmpty()) {
            return 0;
        }else{
            return this.primero.getData();
        }
    }
    // Método para imprimir los elementos de la cola
    public void print() {
        if (isEmpty()) {
            System.out.println("Cola vacía");
        } else {
            Node aux = this.primero;  // Comienza desde el primer elemento
            for (int i = 0; i < this.size; i++) {
                System.out.println(aux.getData());  // Imprime el valor del elemento actual
                aux = aux.getNext();  // Mueve el puntero "aux" al siguiente nodo
            }
        }
    }
}
