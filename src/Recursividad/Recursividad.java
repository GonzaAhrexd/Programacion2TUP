package Recursividad;
public class Recursividad{
    public static void numeros(int actual, int limite){
        System.out.println(actual);
        if(actual!=limite){
            numeros(actual+1,limite);
        }
    
    }
    public static void main(String[] args) {
        numeros(1, 100);
    }
}