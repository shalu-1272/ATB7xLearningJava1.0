package ex_07202024;

public class Lab068 {
    public static void main(String[] args) {
    //JDK> 13
        // we don't need to type break multiple times
        int itemcode = 001;
        switch(itemcode)
        {
            case 001 -> System.out.println("M");
            case 002 -> System.out.println("E");
            default ->  System.out.println("None");
        }
    }
}
