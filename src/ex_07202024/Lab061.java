package ex_07202024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab061 {
    public static void main(String[] args) {
        /**Grade Calculator Program
         A - 90-100
         B- 80-89
         C 70-79
         D 60-69
         F 0-59
         User input numbers
         Return has to be a char (grades)**/

        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        char grade = 'F';
        if (marks >= 90 && marks <=100)
        {
           // System.out.println("Grade A");
            grade = 'A';
        }
       else if (marks >= 80 && marks < 90) {
            //System.out.println("Grade B");
            grade = 'B';
        }
       else if (marks >= 70 && marks < 80) {
            //System.out.println("Grade C");
            grade='C';
        }
       else if (marks >= 60 && marks < 70) {
            //System.out.println("Grade D");
            grade = 'D';
        }
       else {
            //System.out.println("Grade F");
            grade = 'F';
       }
       sc.close();
        System.out.println("your Grade is" +'\n'+grade);
    }
}