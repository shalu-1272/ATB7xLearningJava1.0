package ex_08042024;

public class Lab130 {
    int age = 42;   //Instance Variable

    void F1()
    {
        int e = 10;
        System.out.println(age);  //age is public and we can use it in the function
    }
    void F2()
    {
        int e=50;
       System.out.println(e); //e cannot be used as F1 is not a public life of e is within F1.
    }
}
