package EstructuraLineal;

public class Stack {


    private Node top = null;
    private int size;
    //Push - Peak - Pop


    public Node getTop() {
        return top;
    }

    public void setTop(Node top) {
        this.top = top;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void push(int num) {
        Node nodo = new Node(num);
        nodo.setNext(top);
        this.top = nodo;
        this.size++;
    }

    public void peak() {
        if (top != null) {
            Node eliminar = this.top;
            this.top = this.top.getNext();
            eliminar.setNext(null);
            this.size--;
        }
    }

    public int getElement(){
        if(top == null){
            return 0;
        }else{
            return top.getData();
        }
    }
}