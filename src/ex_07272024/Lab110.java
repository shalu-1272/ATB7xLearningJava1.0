package ex_07272024;

import java.util.Scanner;

public class Lab110 {
    public static void main(String[] args) {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark 1");
        marks[0] = sc.nextInt();
        System.out.println("Enter marks 2");
        marks[1] = sc.nextInt();
        System.out.println("Enter marks 3");
        marks[2] = sc.nextInt();

        System.out.println(marks[1]);
    }
}
