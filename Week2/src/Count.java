import java.util.*;

/**
 * Created by jagtapm on 7/20/2017.
 */
public class Count {
    void displayCount(List<Person> personList) {
        HashMap<String,Integer> countList = new HashMap<String, Integer>();
        for (Person person : personList) {
            if(countList.containsKey(person.getName())){
                countList.put(person.getName(),countList.get(person.getName()) + 1);
            }
            else {
                countList.put(person.getName(),1);
            }
        }
        for (String key : countList.keySet()) {
            System.out.println(key +  " " +countList.get(key));
        }

    }
}



