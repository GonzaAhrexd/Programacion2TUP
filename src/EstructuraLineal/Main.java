package EstructuraLineal;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        Cola colaSuper = new Cola();
        colaSuper.enqueue(1);
        colaSuper.enqueue(2);
        colaSuper.enqueue(3);
        colaSuper.enqueue(4);
        colaSuper.enqueue(5);
        colaSuper.enqueue(6);
        System.out.println(colaSuper.getSize());
        System.out.println("Cola del supermercado");
        while(colaSuper.getSize() != 0){
            System.out.println(colaSuper.getElement());
            System.out.println("Presione una tecla luego de atender a un cliente");
            String a = input.nextLine();
            colaSuper.dequeue();
        }
    }
}
