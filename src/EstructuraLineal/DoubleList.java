package EstructuraLineal;

import java.awt.image.DataBufferDouble;

public class DoubleList {
    private DoubleNode head;
    private DoubleNode tail;
    private int size;

    public DoubleList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public DoubleNode getHead() {
        return head;
    }

    public void setHead(DoubleNode head) {
        this.head = head;
    }

    public DoubleNode getTail() {
        return tail;
    }

    public void setTail(DoubleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public void add(String phrase){
        DoubleNode nuevo = new DoubleNode(phrase);
        if(isEmpty()){
            this.head = nuevo;
            this.tail = nuevo;
        }else{
            DoubleNode aux  =  head;
            while(aux.next != null){
                aux  =  aux.next;
            }
            aux.setNext(nuevo);
            nuevo.setPrevious(aux);
            this.tail = nuevo;
        }
        this.size++;
    }

    public void addBeggining(String phrase){
        DoubleNode nuevo = new DoubleNode(phrase);
        if(isEmpty()){
            this.head = nuevo;
            }else {
            nuevo.setNext(this.head);
            this.head.setPrevious(nuevo);
            this.head = nuevo;
        }
    }


}
