import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

final class CustomStringUtils {
    private CustomStringUtils() {
    }
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }
}

class CustomStringUtilsTest {

    @Test
    void givenNonEmptyString_whenIsEmptyMethodIsCalled_thenFalseIsReturned() {
        boolean empty = CustomStringUtils.isEmpty("baeldung");
        Assertions.assertFalse(empty);
    }
}