package POO.Animales;

public class index {
    public static void main(String[] args) {
        Perro miPerro = new Perro("https://t0.gstatic.com/licensed-image?q=tbn:ANd9GcQkrjYxSfSHeCEA7hkPy8e2JphDsfFHZVKqx-3t37E4XKr-AT7DML8IwtwY0TnZsUcQ");
        Gato miGato = new Gato("Cat");
        System.out.println(miPerro.naturaleza);
        System.out.println(miPerro.comer());
        //Sobrecarga de metodos
        System.out.println(miGato.comer("pescado"));
    }
}