package POO.Interfaz.Movible;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void goUp() {
        y += 1 * this.ySpeed;
    }

    @Override
    public void goDown() {
        y -= 1* this.ySpeed;
    }

    @Override
    public void goRight() {
        x += 1 * this.xSpeed;
    }

    @Override
    public void goLeft() {
        x -= 1 * this.xSpeed;
    }
}
