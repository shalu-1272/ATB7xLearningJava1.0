package ex_08172024.WrapperClass;

public class Lab155 {
    public static void main(String[] args) {


    //Wrapper class
    /**
     * int - primitive data type
     */

  //  int a = 10;
    //    System.out.println(a);

        //Java needs everything should be a class or an object so every primitive data
        // type has a wrapper class that provides extra functions

        Integer a1 = 10;
        Integer a2 = 10;
        System.out.println(a1.compareTo(a2));
        boolean equals = a1.equals(3);
        System.out.println(equals);
    }
}
