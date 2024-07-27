package ex_07212024;

public class Lab105 {
    public static void main(String[] args) {
        //Two components of a functions
        //We have to define the functions
        //Then we have to call the functions in our class
        //main is also a functions
        //Method vs function - Later in oops
        for(int i =1; i<=5; i++) {
            greet();   //we are calling the function
        }
//we can call the function as many times
    }
    static void greet() //defination part
    {
        System.out.println("Hello!! How are you??");
    }
}
