package ex_07272024;

import java.util.Scanner;

public class Lab116 {
    public static void main(String[] args) {
        //System.out.println(args[0]);
//user input of 5 subjects abd calc avg
        int[] marks = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();

        for (int i =0; i < marks.length; i++)
        {
            int avg = marks[0]+marks[1]+marks[2]+marks[3]+marks[4]/5;

        }



    }
}
