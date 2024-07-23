package ex_07202024;

import java.util.Scanner;

public class Lab075 {
    public static void main(String[] args) {
        //program to find largest number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1");
        int num = sc.nextInt();
        System.out.println("Enter the number 2");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2");
        int num2 = sc.nextInt();

        if(num1>num2 && num1>num)
        {
            System.out.println("largest is"+num1);
        }
        else if (num2 > num1 && num2>num)
        {
            System.out.println("largest is"+num2);
        }
        else if (num==num1 && num==num2)
        {
            System.out.println("Equal");
        }
        else {
            System.out.println(num + "is largest");
        }
    }
}
