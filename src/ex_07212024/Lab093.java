package ex_07212024;

public class Lab093 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if(i==5)
            {
                continue;  //it will take back to loop..will not come to else statement
            }
            else {
                System.out.println("lol");
            }
        }
    }
}
