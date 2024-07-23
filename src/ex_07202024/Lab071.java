package ex_07202024;

import java.util.Scanner;

public class Lab071 {
    public static void main(String[] args) {
        //write a program to ask me my name, age and salary and then print it
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name, age and salary");
        String name = sc.next();
        int age = sc.nextInt();
        double salary = sc.nextDouble();

        System.out.printf("Name is %s, age is %d and salary is %f",name,age,salary);


    }
}
