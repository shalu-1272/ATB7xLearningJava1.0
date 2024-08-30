package ex_08172024.exceptionhandling;

public class Lab172 {
    public static void main(String[] args) {
        //exception passing
        extracted();
    }

    private static void extracted() {
        extracted1();
    }

    public static void extracted1() {
        try {
            Integer [] i = new Integer[2];
            System.out.println(i[3]); //unchecked exception
        } catch (Exception e) {
            System.out.println("ArrayIndexBound");;
        } finally {
            System.out.println("Close");
        }
    }
}
