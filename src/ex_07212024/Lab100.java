package ex_07212024;

import java.util.Scanner;

public class Lab100 {
    public static void main(String[] args) {
        //factorial program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is needed");
        int n = sc.nextInt();
        int i = 1;
        int fact = 1;
        //factorial of 5 = 5*4*3*2*1
        while(i<=n) {
            fact = fact * i;
            i++;
        }
            System.out.println(fact);
sc.close();
    }

}
