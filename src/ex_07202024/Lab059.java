package ex_07202024;

import java.util.Scanner;

public class Lab059 {
    public static void main(String[] args) {
//Maximum number in 2 inputs

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();
      //  System.out.println(Math.max(num1,num2));
        if(num1>num2)
        {
            System.out.println("num1 is greater than num2");
        }
        if (num1 == num2)   //we can use else if or if
        {
            System.out.println("numbers are equal");
        }
        else
        {
            System.out.println("num2 is greater");
        }

    }
}
