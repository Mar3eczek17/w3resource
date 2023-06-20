import org.junit.jupiter.api.Assertions;

public class Main {
    public static void main(String[] args) {
        String str = capitalize("baeldung");
        Assertions.assertEquals(str, "Baeldung");
    }
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}