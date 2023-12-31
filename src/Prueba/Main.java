package Prueba;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n");

        Scanner scanner = new Scanner(System.in);
        Concesionaria concesionaria1 = new Concesionaria();
        crearArchivo("archivo.dat");

        System.out.println("\nBienvenido a la consecionaria de vehiculos, que desea hacer? ");

        while(true){

            System.out.println("\n 1- agregar vehiculo \n 2- eliminar vehiculo \n 3- editar precio de un vehiculo \n 4- mostrar inventario de la consecionaria \n 5- guardar inventario \n 6- cargar inventario  \n\n 5- SALIR ");

            System.out.print("eleccion:");
            int eleccion = scanner.nextInt();
            scanner.nextLine();

            switch (eleccion) {

                //agregar vehiculo
                case 1:

                    System.out.println("\nseleccione que desea agregar: \n1-auto\n2-moto ");
                    System.out.print("eleccion:");
                    int vehiculoElegido = scanner.nextInt();
                    scanner.nextLine();

                    if (vehiculoElegido==1){
                        System.out.print("\nIngrese marca del auto: ");
                        String marcaAuto = scanner.nextLine();
                        System.out.print("Ingrese modelo del auto: ");
                        String modeloAuto = scanner.nextLine();
                        System.out.print("Ingrese precio del auto: ");
                        double precioAuto = scanner.nextDouble();
                        scanner.nextLine();

                        Coche nuevoCoche = new Coche(marcaAuto,modeloAuto,precioAuto);
                        concesionaria1.agregarVehiculo(nuevoCoche);
                        concesionaria1.mostrarInventario();


                    }else if (vehiculoElegido==2){
                        System.out.print("Ingrese marca de la moto: ");
                        String marcaMoto = scanner.nextLine();
                        System.out.print("Ingrese modelo de la moto: ");
                        String modeloMoto = scanner.nextLine();
                        System.out.print("Ingrese precio de la moto: ");
                        double precioMoto = scanner.nextDouble();
                        scanner.nextLine();

                        Moto nuevaMoto = new Moto(marcaMoto,modeloMoto,precioMoto);
                        concesionaria1.agregarVehiculo(nuevaMoto);
                        concesionaria1.mostrarInventario();

                    }else {
                        System.out.println("opcion denegada");
                    }


                    break;

                //eliminar vehiculo
                case 2:

                    System.out.print("Ingrese marca del vehiculo a eliminar: ");
                    String marcaEliminar = scanner.nextLine();
                    System.out.print("Ingrese modelo del vehiculo a eliminar: ");
                    String modeloEliminar = scanner.nextLine();

                    concesionaria1.eliminarVehiculo(marcaEliminar, modeloEliminar);
                    concesionaria1.mostrarInventario();

                    break;

                //editar vehiculo
                case 3:

                    System.out.print("Ingrese la marca del vehiculo a editar: ");
                    String marcaEditar = scanner.nextLine();
                    System.out.print("Ingrese el modelo del vehiculo a editar: ");
                    String modeloEditar = scanner.nextLine();
                    System.out.print("Ingrese su nuevo precio: ");
                    double precioNuevo = scanner.nextDouble();
                    scanner.nextLine();

                    concesionaria1.editarPrecio(marcaEditar,modeloEditar,precioNuevo);
                    concesionaria1.mostrarInventario();

                    break;

                //mostrar inventario
                case 4:
                    concesionaria1.mostrarInventario();
                    break;

                //guardar inventario
                case 5:
                    concesionaria1.guardar("archivo");
                    break;

                //cargar inventario
                case 6:
                    // Cargar los datos de la concesionaria desde el archivo
                    Concesionaria concesionariaCargada = concesionaria1.cargar("archivo");

                    if (concesionariaCargada != null) {
                        System.out.println("Vehículos en la concesionaria cargada:");
                        concesionariaCargada.mostrarInventario();
                    }
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
        }
    }

    //metodo para crear archivo
    public static void crearArchivo(String nombreArchivo){

        File archivo = new File(nombreArchivo);

        try {
            if (archivo.createNewFile()) {
                System.out.println("El archivo se ha creado correctamente.");
            } else {
                System.out.println("El archivo ya existe.");
            }
        } catch (IOException e) {
            System.err.println("Error al crear el archivo: " + e.getMessage());
        }

    }

}

interface SerializableIO<Tipo> {
    void guardar(String nombreArchivo);
    Tipo cargar(String nombreArchivo);
}

//clase abstracta vehiculo
abstract class Vehiculo {

    //atributos
    String marca, modelo;
    Double precio;

    //getters y setters
    public String getmarca(){
        return marca;
    }
    public String getmodelo(){
        return modelo;
    }
    public Double getprecio(){
        return precio;
    }
    public void setmarca(String marca){
        this.marca=marca;
    }
    public void setmodelo(String modelo){
        this.modelo=modelo;
    }
    public void setprecio(Double precio){
        this.precio=precio;
    }


    //metodos
    public abstract double calcularImpuesto();
    public abstract void mostrarInformacion();


}

//subclase coche
class Coche extends Vehiculo{

    //constructor
    Coche(String marca, String modelo, Double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    //metodos
    @Override
    public double calcularImpuesto(){
        return this.precio*0.20;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("marca: "+this.marca+ " - modelo: "+ this.modelo + " - precio: $"+this.precio); ;
    }

}
//subclase moto
class Moto extends Vehiculo{

    //constructor
    Moto(String marca, String modelo, Double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    //metodos
    @Override
    public double calcularImpuesto(){
        return  this.precio*0.22;
    }
    @Override
    public void mostrarInformacion(){
        System.out.println("marca: "+this.marca+ " - modelo: "+ this.modelo + " - precio: $"+this.precio); ;
    }

}

//clase principal concesionaria
class Concesionaria implements Serializable, SerializableIO<Concesionaria>{

    //atributo: un array de objetos vehiculos
    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    //metodos
    public void agregarVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
        System.out.println("\nvehiculo agregado");
    }

    //no anda
    public void eliminarVehiculo(String marca, String modelo){

        for (int i = 0; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getmarca().equals(marca)  && vehiculos.get(i).getmodelo().equals(modelo) ) {
                vehiculos.remove(i);
                System.out.println("\nvehiculo eliminado");
                break;
            }else {
                System.out.println("\nerror al eliminar vehiculo");
            }
        }
    }
    public void editarPrecio(String marca, String modelo, Double nuevoPrecio){

        for (Vehiculo vehiculo: vehiculos) {
            if (vehiculo.getmarca().equals(marca) && vehiculo.getmodelo().equals(modelo)){

                vehiculo.setprecio(nuevoPrecio);
                System.out.println("\nprecio actualizado");

            }
        }
    }
    public void mostrarInventario(){
        System.out.println("\ninventario de la consecionaria:");
        for (Vehiculo vehiculo: vehiculos) {
            vehiculo.mostrarInformacion();
        }

    }


    //metodos sobreescritos de la interfaz para guardar y cargar datos
    @Override
    //metodos para guardar y leer vehiculos de la consecionaria en un archivo
    public void guardar(String nombreArchivo) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            outputStream.writeObject(this);
            System.out.println("Los datos se han guardado en " + nombreArchivo + " correctamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar los datos en " + nombreArchivo + ": " + e.getMessage());
        }
    }

    @Override
    public Concesionaria cargar(String nombreArchivo) {
        Concesionaria concesionariaCargada = null;
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            concesionariaCargada = (Concesionaria) inputStream.readObject();
            System.out.println("Datos cargados correctamente desde " + nombreArchivo + ".");
            return concesionariaCargada;
        } catch (FileNotFoundException e) {
            System.out.println("El archivo " + nombreArchivo + " no existe. Se creará uno nuevo.");
            return new Concesionaria();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar los datos desde " + nombreArchivo + ": " + e.getMessage());
            return null;
        }
    }


}


