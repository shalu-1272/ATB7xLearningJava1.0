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
        System.out.println(arr.size());
        System.out.println(arr.remove(2));
        System.out.println(arr);

        ArrayList newlist = new ArrayList();
        newlist.add("Shaloo");
        newlist.add("Kushagra");
        newlist.add("Vriti");

      //  System.out.println(newlist.clone());
      newlist.add("Shaloo Bansal");
        newlist.set(1,"Kushagra Garg");
        System.out.println(newlist);
      //  System.out.println(newlist);

        //How can we check all the items 1 by 1
        for(int i =0; i< newlist.size(); i++)
        {
            System.out.println(newlist.get(i));
        }
       // System.out.println(newlist.addLast());


        //for each loop
        for(Object o : newlist)
        {
            System.out.println(o);
        }
    }
}
