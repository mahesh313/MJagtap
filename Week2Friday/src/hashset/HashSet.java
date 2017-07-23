package hashset;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by jagtapm on 7/21/2017.
 */
public class HashSet<T> {
    private T hashSet[];
    private int capacity;
    private int size = 0;
    private float loadFactor = (float) 0.75;

    public HashSet(Class<T[]> t) {
        hashSet = t.cast(Array.newInstance(t.getComponentType(), 16));
        this.capacity = 16;
    }

    public HashSet (Class<T[]> t, int capacity) {
        hashSet = t.cast(Array.newInstance(t.getComponentType(), capacity));
        this.capacity = capacity;
    }

//    public HashSet(Collection collection) {
//        Iterator iterator = collection.iterator();
//        hashSet = (T[]) new Array[collection.size() + 1];
//        while (iterator.hasNext()) {
//            hashSet[size++] = (T) iterator.next();
//            }
//    }

    public void display() {
        for (T t: hashSet) {
            System.out.println(t);

        }
    }

    public boolean contains(T input) {
        for (T t : this.hashSet) {
            if (input.equals(t))
                return true;
        }
        return false;
    }

    public boolean add(T input) {
        boolean flag = false;
        for (T t : this.hashSet) {
            if (input.equals(t)) {
                flag = true;
                break;
            }
        }
        if(flag == false) {
            if (size < capacity) {
                hashSet[size++] = input;
                return true;
            }
            else {
                System.out.println("Hashset is full");
            }
        }
        return false;

    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return size;
    }




}




