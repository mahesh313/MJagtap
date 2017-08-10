package primeAssignment;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jagtapm on 7/17/2017.
 */
public class PrimeTest {
    @Test
    public void checkPrime(){
        List<Boolean> list = new ArrayList<Boolean>(100);
        list = Arrays.asList(false, false, true, true, false, true, false, true);
        Assert.assertEquals("expected output not coming", list , Prime.generatePrime(7));
    }
}
