package ex_07212024;

public class Lab081 {
    public static void main(String[] args) {
        final boolean b1 = true;
       // b1 = false; //can't be changed
        for (int i = 0; b1; i++) {
            System.out.println("hello");
            //infinite loop
        }
    }
}
