package ex_08102024.poly.methodoverloading;

public class Lab143 {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        //mathOperations.add(2,5);
        System.out.println(mathOperations.add(2,5));
        System.out.println(mathOperations.add("shaloo","bansal"));
    }
}
