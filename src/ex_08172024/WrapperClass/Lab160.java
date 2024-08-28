package ex_08172024.WrapperClass;

public class Lab160 {

    public static void main(String[] args) {
        A a = new A();
        A a1 = new A();

        a.age = 12;
        System.out.println(A.discount);
a.m2();
A.m1();
    }
}

    class A
    {
        int age = 10;
        static int discount = 10;

        static {
            System.out.println("A");
        }

        {
            System.out.println("IIB");
        }

        static void m1() {
            System.out.println("Static function m1");

        }

        void m2() {
            System.out.println("Non Static function m2");
            System.out.println(discount);
        }
    }
