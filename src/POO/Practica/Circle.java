package POO.Practica;

public class Circle {
    protected Double radius;
    protected String color;
    public Circle(){
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(Double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public Circle(Double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(Double radius) {
        this.radius = radius;
    }
    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius,2);
    }
    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }

    public String toString(){
        return "Circle[radius=" + this.radius + ", color= " + this.color + "]";
    }
}
