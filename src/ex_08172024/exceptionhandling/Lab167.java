package ex_08172024.exceptionhandling;

public class Lab167 {
    public static void main(String[] args) {
        //unchecked exception

        try {
            int a = 10;
            int b = a/0;
            System.out.println(b);
        } catch (Exception e) {
            System.out.println("Error is  with the division by 0");
        }
        System.out.println("end");

    }
}
