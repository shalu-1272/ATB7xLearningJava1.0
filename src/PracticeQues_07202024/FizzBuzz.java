package PracticeQues_07202024;
import java.util.Scanner;
public class FizzBuzz {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number");
            short number = sc.nextShort();


            if(number >0 && number <=100 && number%3==0 && number%5!=0)
            {
                System.out.println("Fizz");
            }
            else if (number >0 && number <=100 && number%5==0 && number%3!=0)
            {
                System.out.println("Buzz");
            }
            else if (number >0 && number <=100 && number%5==0 && number%3==0)
            {
                System.out.println("FizzBuzz");
            }
            else if (number > 100 && number % 5 == 0 || number % 3 == 0)
            {
                System.out.println("Out of 1-100 Range");
            }
            else
            {
                System.out.println("Neither a multiple of 3 nor 5");
            }
        }
        }
