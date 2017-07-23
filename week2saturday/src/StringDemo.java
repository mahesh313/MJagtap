/**
 * Created by jagtapm on 7/22/2017.
 */
public class StringDemo {
    public static void main(String[] args) {

        String str1 = "Maheshh".intern();
        String str2 = "Maheshh";
        System.out.println(str1==str2);
    }

}
