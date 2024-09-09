package ex_08172024.CollectionFW.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Lab166 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("Shaloo");
        names.add("Vriti");
        names.add("Urvi");


       // Collections.sort(names);
        //System.out.println(names);

        //Print - 1
        System.out.println(names);

        //Print 2 using for loop
        for(String str : names)
        {
            System.out.println(str);
        }

        //3rd
        for(int i = 0; i < names.size(); i++)
        {
            System.out.println(names.get(i));
        }

        //Iterator -iterate over elements 1-1
        Iterator<String> its = names.iterator();
        while(its.hasNext())
        {
            System.out.println(its.next());
        }



    }
}
