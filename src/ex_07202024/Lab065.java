package ex_07202024;

import java.util.Scanner;

public class Lab065 {
    public static void main(String[] args) {
        //Take user input and tell whether it is a vowel or not
        //a,e,i,o,u

        Scanner sc = new Scanner(System.in);
        char vowel = sc.next().charAt(0);  //input string and check char at '0' index

        switch(vowel)
        {
            case 'a', 'e', 'i', 'o','u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");

        }

    }
}
