import java.util.Collection;
import java.util.HashSet;

public class JavaCollectionRemoveExample2 {
    public static void main(String[] args) {
        Collection<String> collection = new HashSet<>();
        collection.add("Reema");
        collection.add("Geetanajli");
        collection.add("Mahesh");
        collection.add("Ajeet");

        for (String i:collection) {
            System.out.println(i);
        }
        //will remove the specified element from the collection
        boolean val=collection.remove("ABC");
        System.out.println("Remove method will return:"+val);
    }
}
