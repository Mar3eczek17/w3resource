class TrafficLight {
    private String color;
    private int duration;
    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
    public boolean isRed() {
        return color.equals("red");
    }
    public boolean isGreen() {
        return color.equals("green");
    }
}
public class Main_8 {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("red", 30);

        System.out.println("The light is red: " + light.isRed());
        System.out.println("The light is green: " + light.isGreen());
    }
}
