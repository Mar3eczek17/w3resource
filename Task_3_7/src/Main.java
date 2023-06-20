import org.junit.jupiter.api.Assertions;

import java.util.Arrays;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1","2","3");
        Collections.reverse(list);
        Assertions.assertEquals(list, Arrays.asList("3","2","1"));
    }
}