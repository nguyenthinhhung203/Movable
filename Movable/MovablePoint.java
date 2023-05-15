package Interface.Movable;

public class MovablePoint implements Movable{
    int x ;
    int y ;
    int xSpeed;
    int ySpeed;


    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y = y + ySpeed;
    }
    public void moveUp(int ys) {
        y = y + ys;
    }

    @Override
    public void moveDowm() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }


    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
