package hashset;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jagtapm on 7/22/2017.
 */
public class HashSetTest {
    @Test
    public void HashSetTest() {
        HashSet<String> foo = new HashSet<String>(String[].class, 16);
        HashSet<String> foo1 = new HashSet<String>(String[].class);
//        List<String> list = new ArrayList<>();
//        list.add("Mahesh");
//        list.add("Dinesh");
//        list.add("Jagtap");
//        HashSet foo2 = new HashSet(list);
        System.out.println(foo.isEmpty());
        foo.add("Mahesh");
        foo.add("Jagtap");
        System.out.println(foo.size());
        System.out.println(foo.contains("Mahesh"));
        System.out.println(foo.isEmpty());
        foo.display();
//        String string = "Mahesh".intern();


    }

}
