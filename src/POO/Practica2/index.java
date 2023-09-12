package POO.Practica2;

public class index {
    public static void main(String[] args) {
        Electrodomestico[] listaElectrodomesticos;
        float sumatoriaLavarropas = 0;
        float sumatoriaTelevision = 0;
        float sumatoriaElectrodomesticos = 0;
        listaElectrodomesticos = new Electrodomestico[10];
        listaElectrodomesticos[0] = new Lavarropas(50,25);
        listaElectrodomesticos[1] = new Television(25,true);
        listaElectrodomesticos[2] = new Lavarropas(250,"Rojo",'F',50,20);
        listaElectrodomesticos[3] = new Lavarropas(250,'D');
        listaElectrodomesticos[4] = new Television(240,"Azul",'D',230,45,false);
        listaElectrodomesticos[5] = new Television(240,'E');
        listaElectrodomesticos[6] = new Lavarropas(300,'A');
        listaElectrodomesticos[7] = new Television(250,true);
        listaElectrodomesticos[8] = new Lavarropas();
        listaElectrodomesticos[9] = new Television();

        //System.out.println(listaElectrodomesticos[3] instanceof Lavarropas);


        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            System.out.println(electrodomestico.toString());
            if(electrodomestico instanceof Lavarropas){
                sumatoriaLavarropas += electrodomestico.precioFinal();
            }else if(electrodomestico instanceof Television){
                sumatoriaTelevision += electrodomestico.precioFinal();
            }
            sumatoriaElectrodomesticos += electrodomestico.precioFinal();
        }

        System.out.println("Los precios totales son los siguientes:");
        System.out.println("Electrodomesticos: " + sumatoriaElectrodomesticos);
        System.out.println("Lavarropas: " + sumatoriaLavarropas);
        System.out.println("Television: " + sumatoriaTelevision);




    }
}

