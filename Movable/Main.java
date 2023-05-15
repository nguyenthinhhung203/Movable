package Interface.Movable;

public class Main {
    public static void main(String[] args) {
        MovablePoint center = new MovablePoint(0,1, 2,3);
        center.moveUp();
        center.moveUp(6);
        MovableCircle circle = new MovableCircle(10,center);
        System.out.println(circle.toString());
    }
}
