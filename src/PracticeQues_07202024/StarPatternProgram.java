package PracticeQues_07202024;

public class StarPatternProgram {
    public static void main(String[] args) {
        //create a program to print 5 row of star incrementing by 1
       // int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}