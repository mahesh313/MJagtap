/**
 * Created by jagtapm on 7/21/2017.
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person("Ramesh", "M");
        Person p2 = new Person("Ramesh", "M");
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p1));
        System.out.println(p1.equals(null));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        Integer.valueOf(1000);

    }
}
