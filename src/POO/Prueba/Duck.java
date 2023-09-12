package POO.Prueba;

public class Duck {
    private static int duckCount = 0;

    private String color;
    private float size;

    public Duck(String color, float size) {
        duckCount += 1;
        this.color = color;
        this.size = size;
    }
    public static int getCount(){
        return duckCount;

    }
}
