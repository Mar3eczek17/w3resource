import org.junit.jupiter.api.Assertions;

final class CustomStringUtils {
    private CustomStringUtils() {
    }
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}

public class Main {
    public static void main(String[] args) {
        CharSequence text ="a";
        CharSequence text1 ="";
        boolean result = CustomStringUtils.isEmpty(text);
        System.out.println("Is empty? " + result);
        boolean result1 = CustomStringUtils.isEmpty(text1);
        System.out.println("Is empty? " + result1);
    }
}