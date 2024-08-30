package ex_08172024.exceptionhandling;

public class Lab168 {
    public static void main(String[] args) {
        int c = 2;
        try {
            int d = 10/c;
        } catch (Exception e) {
            System.out.println("Divided by 0 is the problem");
        }
        System.out.println(c);
    }
}
