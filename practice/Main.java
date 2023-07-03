package practice;

public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(1, 2);
        System.out.println("Before => " + myCircle);

        moveCircle(myCircle, 5, 10);
        System.out.println("After => " + myCircle);
    }

    public static void moveCircle(Circle circle, int deltaX, int deltaY) {
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        circle = new Circle(0, 0);
    }
}
