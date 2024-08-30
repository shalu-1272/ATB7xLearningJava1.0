package ex_08172024.exceptionhandling;

public class Lab171 {
    public static void main(String[] args) {
        try {
            int a = 10/0; //vunerable code
        } catch (Exception e) {
            System.out.println("Div by 0");
        }
        finally{
            System.out.println("I will be executed anyhow");
        }

    }
}
