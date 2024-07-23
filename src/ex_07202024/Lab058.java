package ex_07202024;
import java.util.Scanner;
public class Lab058 {
    public static void main(String[] args) {
        //take user input and check if the number is even or odd
        // logic building
        //1st fig out input
        //2nd data type
        //3rd do we need conversion
        //4th rough logic
        //5th optimize

        //to take input in java use Scanner class
        Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                //int n1 = sc.nextInt();

        if(n%2==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
        sc.close();
    }
}
