import org.junit.jupiter.api.Assertions;


class StaticCounter {
    private static int counter = 0;

    public static int incrementCounter() {
        return ++counter;
    }

    public static int getCounterValue() {
        return counter;
    }
}


public class Task_1 {
    public static void main(String[] args) {
        int oldValue = StaticCounter.getCounterValue();
        int newValue = StaticCounter.incrementCounter();
        Assertions.assertEquals(newValue, oldValue + 1);
    }
}

