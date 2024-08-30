package ex_08172024.exceptionhandling;

public class Lab169 {
    public static void main(String[] args) {
        int a1 = 0;
        try {
            String ip = args[0];
           int a = Integer.parseInt(ip);
            a1 = 1000/a;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(a1);
    }
}
