package ex_07272024;

import java.util.Scanner;

public class Lab112 {
    public static void main(String[] args) {
       // String weekDays[] = {"Sunday","Monday","Tues","Wed","Thurs","Fri","Sat"};
        String weekDays[] = new String[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days");
       // for(int j =0; j <weekDays[]; j)
        weekDays[0] = sc.next();
        weekDays[1] = sc.next();
        weekDays[2] = sc.next();
        weekDays[3] = sc.next();
        weekDays[4] = sc.next();
        weekDays[5] = sc.next();
        weekDays[6] = sc.next();

        for(int i = 0; i< weekDays.length; i++)
        {
            System.out.println(weekDays[i]);
        }


    }
}
