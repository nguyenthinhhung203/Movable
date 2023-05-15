package Interface.Movable;

public class MovableCircle implements Movable{

    int radius;
    MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {

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
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
