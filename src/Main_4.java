class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}
public class Main_4 {
    public static void main(String[] args) {
        int r1 = 5;
        Circle circle = new Circle(r1);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());

        int r2 = 8;
        circle.setRadius(r2);

        System.out.println(circle.getArea());
        System.out.println(circle.getCircumference());
    }
}
