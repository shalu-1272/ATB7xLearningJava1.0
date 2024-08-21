package ex_08102024.superthiskeyword;

public class Lab148 {
    class Student extends Person {
        Student() {
            super();
            System.out.println("DC - Student");

        }

        Student(int a) {
            System.out.println("PC - Student");
        }
    }

    //Constructor Chaining
    class Person {
        Person() {
            System.out.println("DC - Person");
        }

        Person(int a) {
            System.out.println("PC - Person");
        }

        Person(String a, int b) {
            System.out.println("PC");
        }

    }
}