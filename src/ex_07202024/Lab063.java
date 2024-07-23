package ex_07202024;

import java.util.Scanner;

public class Lab063 {
    public static void main(String[] args) {
     //switch condition - better way to use if you have 2+ conditions
     //example - which day it is
     //user enters 3 - Display Wednesday ( 1- Monday)
     //expression must be in int, byte, short, long, String, enums
        //Value for switch case should be literal or constant not variable
        //Break can be used
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day from 1-7 & we will let you know the day");
        int day = sc.nextInt();

        switch(day)
        {
            case 1:    //if we run w/o break then all the cases will run
                System.out.println("Monday");
                break;   //if breaks the loop
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("No idea what day it is");
        }
        System.out.println("Outside the switch loop");

    }
}
