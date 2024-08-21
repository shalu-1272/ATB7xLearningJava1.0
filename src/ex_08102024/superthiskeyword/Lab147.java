package ex_08102024.superthiskeyword;

public class Lab147 {

    public static void main(String[] args) {
        Student s = new Student();
        s.display();

    }
}
    class Student extends Person{
       @Override
        void message()
        {
            System.out.println("Hi Student");
        }
        void display()
        {
            this.message();
            super.message();
        }
    }
    class Person{
        void message()
        {
            System.out.println("Hi Person");
        }
    }


