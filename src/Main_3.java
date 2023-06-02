class Rectangle {
    int width;
    int height;

    void Area() {
        int area;
        area = this.height*this.width;
        System.out.println(area);
    }

    void Perimeter() {
        int perimeter;
        perimeter = 2*(this.height + this.width);
        System.out.println(perimeter);
    }
}

public class Main_3 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        // Assigning the values in the variables
        rectangle.height = 10;
        rectangle.width = 5;

        System.out.println(rectangle.height);
        System.out.println(rectangle.width);

        // Calling of Area method of Rectangle Class
        rectangle.Area();

        // Calling of Perimeter method of Rectangle Class
        rectangle.Perimeter();
    }
}
