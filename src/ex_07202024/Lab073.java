package ex_07202024;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {
       //program to find number is positive, negative or 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
if(number >0)
{
    System.out.println("+");
}
else if (number < 0)
{
    System.out.println("-");
}
else {
    System.out.println("0");
}
    }
}
