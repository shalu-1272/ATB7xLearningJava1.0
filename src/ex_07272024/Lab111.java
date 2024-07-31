package ex_07272024;

import java.util.Scanner;

public class Lab111 {
    public static void main(String[] args) {
        int marks[] = new int[3];

        //if we want user input for marks
        Scanner sc = new Scanner(System.in);
       // marks[0] = sc.nextInt();
        marks[0]=sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]=sc.nextInt();
        for(int i =0; i< marks.length; i++)  //i shows index
        {
            System.out.println("Enter the marks for 1st Subject ->" +marks[i]);
        }

        //0 index - 1st input and so on
    }
}
