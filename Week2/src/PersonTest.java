import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jagtapm on 7/20/2017.
 */
public class PersonTest {
    List<Person> createTestData() {
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Mahesh", Gender.MALE));
        personList.add(new Person("Niltesh", Gender.MALE));
        personList.add(new Person("KIRAN", Gender.MALE));
        personList.add(new Person("KIRAN", Gender.FEMALE));
        personList.add(new Person("KIRAN", Gender.MALE));
        personList.add(new Person("Mahesh", Gender.FEMALE));
        personList.add(new Person("Sameer", Gender.MALE));
        return personList;
    }

    @Test
    public void testPerson() {
        List<Person> personList = createTestData();
        Count c = new Count();
        c.displayCount(personList);
        Set<Integer> set = new HashSet<>();

    }

}
