package ex_07202024;

import java.util.Scanner;

public class Lab074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int c = (number < 0)?1:(number >0)?2:3;

        switch(c)
        {
            case 1:
                System.out.println("Number is negative");
                break;
            case 2:
                System.out.println("Number is positive");
                break;
            default:
                System.out.println("Number is 0");

                //we have used conditional statement
                //if num < 0 then value is 1
                // if num > 0 then value is <0
                //if 0 then 3
        }

    }
}
