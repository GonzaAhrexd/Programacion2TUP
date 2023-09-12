package POO.Animales;

public class Animal {
    public String tipo;
    public String imagen;
    public String naturaleza;
    public String habitat;

    public Animal(String tipo, String imagen, String naturaleza, String habitat) {
        this.tipo = tipo;
        this.imagen = imagen;
        this.naturaleza = naturaleza;
        this.habitat = habitat;
    }

    public String comer(){
        return "comiendo ";
    }

}
