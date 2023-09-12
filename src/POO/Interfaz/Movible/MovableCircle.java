package POO.Interfaz.Movible;

public class MovableCircle extends MovablePoint implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
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
