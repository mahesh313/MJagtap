package arrayApi;

import org.junit.Test;

/**
 * Created by jagtapm on 7/28/2017.
 */
public class ArrayHolderTest {
    int a[] = {3, 5, 7, 8, 86, 48};
    ArrayHolder arrayHolder = new ArrayHolder(a);

    @Test
    public void testForEach() {
        arrayHolder.foreach((Integer i) -> {
            System.out.println(i);});

    }

    @Test
    public void testModifyElements() {
        arrayHolder.modifyElements((Integer integer) -> { return integer + 3;});
        arrayHolder.foreach((Integer i) -> {
            System.out.println(i);});

    }

    @Test
    public void testDeleteElement() {
        arrayHolder.deleteElement((Integer integer) -> {return integer > 7;});
        arrayHolder.foreach((Integer i) -> {
            System.out.println(i);});
    }

    @Test
    public void testFold() {
        System.out.println(arrayHolder.fold((Integer num1, Integer num2) -> {return num1 + num2;}));

    }

}
