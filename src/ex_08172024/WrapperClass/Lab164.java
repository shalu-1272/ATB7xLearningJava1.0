package ex_08172024.WrapperClass;

public class Lab164 {
    //anonymous class
    ABC A = new ABC() {   //anonymous class created using interface functions
        @Override
        public void m1() {

        }

        @Override
        public void m2() {

        }
    };
}

interface ABC
{
void m1();
void m2();
}