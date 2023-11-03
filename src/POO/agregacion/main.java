package POO.agregacion;

import java.net.ConnectException;

public class main {
    public static void main(String[] args) {
        Author ConanDoyle = new Author("Conan Doyle","dorian@gmail.com",'M');
        Author Gonzalo = new Author("Gonzalo","gonza@gmail.com",'M');
        Author[] autores = {ConanDoyle, Gonzalo};
        Book libro1 = new Book("El retrato de Dorian Gray", autores , 'M' , 24);

        System.out.println(libro1.toString());
    }
}
