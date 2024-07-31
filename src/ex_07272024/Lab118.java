package ex_07272024;

import java.util.Scanner;

public class Lab118 {
    public static void main(String[] args) {
        //take the user input of 5 subjects and find the avg
        //Functions are availble in stacks
        //Figure out inputs - data type - int/flaot
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
       // System.out.println("Enter the marks");
      //  marks[0]= sc.nextFloat();
        for(int i =0; i< marks.length;i++)
        {
            System.out.println("Enter the marks");
            marks[i] = sc.nextFloat();
        }
        float avg = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
         System.out.println(avg);
sc.close();

    }
}
