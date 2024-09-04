package ex_08172024.CollectionFW.List;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Lab162 {
    public static void main(String[] args) {
        //Collection FW - List
        //Collection - Interface - Object cannot be created
        //List Interface has implementation by 3 child - Array list, linked list, vector and stack

        //List can be shopping list, mark list, collection of items, to-do list, student list
        List mylist = new ArrayList(); //dynamic Dispatch
        Collection mylist1 = new ArrayList();

        mylist.add("pen");
        mylist.add("marker");
        mylist.add("sharpner");
        mylist.add("123");

        System.out.println(mylist);

        System.out.println(mylist.get(2));
        System.out.println(mylist.getFirst());
        System.out.println(mylist.getLast());
        System.out.println(mylist.contains("marker"));




    }
}
