package ex_08172024.CollectionFW.List;

import java.util.ArrayList;
import java.util.List;

public class Lab163 {
    public static void main(String[] args) {

        List arr = new ArrayList();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(arr);
        System.out.println(arr.getLast());
        System.out.println(arr.contains(3));
        System.out.println(arr.equals(5));

    }
}
