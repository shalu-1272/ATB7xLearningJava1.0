package ex_08172024.exceptionhandling;

public class Lab166 {
    public static void main(String[] args) {
        String ip = args[0]; //ArrayIndexOutOfBoundsException
        int a = Integer.parseInt(ip); //Number Format - If the input is string
        int b = 1000/a;  //Arithmetic operation if a = 0
        System.out.println(b);
    }

}
