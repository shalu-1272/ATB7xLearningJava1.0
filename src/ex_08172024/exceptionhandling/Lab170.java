package ex_08172024.exceptionhandling;

public class Lab170 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            b = 10/a;
        } catch (Exception e) {
            System.out.println("Vunerable");;
        } finally {
            System.out.println("End");
        }
        System.out.println(b);
    }
}
