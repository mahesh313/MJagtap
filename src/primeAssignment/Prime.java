package primeAssignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jagtapm on 7/17/2017.
 */
public class Prime {
    public static List<Boolean> generatePrime(int n) {
        Boolean a[] = new Boolean[n + 1];
        Arrays.fill(a, Boolean.TRUE);
        a[0] = a[1] = false;
        a[2] = true;
//        int n = Math.sqrt((n));

        for(int i = 2; a[i] == true || i < n/2 || i == 2 || (i % 2) != 0; i++) {
            for(int j = 2;  ; j++) {
                if ((i * j) > n) {
                    break;
                } else {
                    a[i * j] = false;
                }
            }
        }
//        for(boolean i : a) {
//            System.out.println(i);
//        }
//        for(int i = 0 ; i < n + 1; i++) {
//            if (!a[i]) {
//                System.out.println(i);
//            }
//        }
//        List<Boolean> list = new ArrayList<Boolean>(1000);

        List<Boolean> booleans = Arrays.asList(a);


        return booleans;

    }


    public static void main(String[] args) {
       Prime p = new Prime();
        p.generatePrime(70);

    }
}