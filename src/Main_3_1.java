class Rectanglee {
    int width;
    int height;

    public Rectanglee(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
    public int getPerimeter() {
        return 2*(width+height);
    }
}
public class Main_3_1 {
    public static void main(String[] args) {
        Rectanglee rectanglee = new Rectanglee(7, 12);

        System.out.println(rectanglee.getArea());
        System.out.println(rectanglee.getPerimeter());

        rectanglee.setWidth(6);
        rectanglee.setHeight(12);

        System.out.println(rectanglee.getArea());
        System.out.println(rectanglee.getPerimeter());
    }
}
