package EstructuraLineal;
import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


       Stack platos = new Stack();
       platos.push(1);
        platos.push(2);
        platos.push(3);
        platos.push(4);

        System.out.println(platos.getElement());
        platos.peak();

        System.out.println(platos.getElement());
        platos.peak();

        System.out.println(platos.getElement());
        platos.peak();
    }
}
