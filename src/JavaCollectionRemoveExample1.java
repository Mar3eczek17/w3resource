import java.util.Collection;
import java.util.HashSet;

public class JavaCollectionRemoveExample1 {
    public static void main(String[] args) {
        Collection<Integer> collection = new HashSet<>();
        collection.add(5);
        collection.add(15);
        collection.add(52);
        collection.add(532);
        collection.add(52);
        for (Integer i:collection) {
            System.out.println(i);
        }
        //will remove the specified element from the collection
        collection.remove(52);
        System.out.println("After removing 52 \nCollection:" + collection);
    }
}
