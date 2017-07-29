package arrayApi;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by jagtapm on 7/28/2017.
 */
public class ArrayHolder {
     int[] values;

    public ArrayHolder(int[] values) {
        this.values = values;
    }


    public void foreach(Consumer<Integer> consumer ) {
        for (int value : values) {
            consumer.accept(value);
        }
    }

    public void modifyElements(Function<Integer, Integer> function) {
        for (int i = 0; i < values.length; i++) {
            values[i] = function.apply(values[i]);
        }
    }

    public void deleteElement(Predicate<Integer> predicate) {
        for (int i = 0; i < values.length; i++) {
            if (predicate.test(values[i])) {
                values[i] = 0;
            }
        }
    }

    public int fold(BiFunction<Integer, Integer, Integer> biFunction) {
        int i;
        for ( i = 0; i < values.length - 1; i++) {
            values[i + 1] = biFunction.apply(values[i] , values[i + 1]);
        }
        return values[i];
    }



}
