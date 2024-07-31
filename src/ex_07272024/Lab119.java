package ex_07272024;

import java.util.Arrays;
import java.util.Scanner;

public class Lab119 {
    public static void main(String[] args) {
        //find the highest salary or find the max in an array
        //step 1 - data type
        int[] salary = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < salary.length; i++) {
            System.out.println("Enter the salary");
            salary[i] = sc.nextInt();
        }
        int maxSalary = 1;
        for (int j = 0; j < salary.length; j++) {
            if (salary[j] > maxSalary) {
                maxSalary = salary[j];
            }
        }
        System.out.println(maxSalary);
       // Arrays.sort(salary); used in ascending order
        //System.out.println(salary.length-1);
    }
}