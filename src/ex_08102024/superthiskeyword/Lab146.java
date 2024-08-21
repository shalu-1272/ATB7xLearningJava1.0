package ex_08102024.superthiskeyword;

public class Lab146 {

    public static void main(String[] args) {
        Car c = new Car();
        c.display();

    }
}
    class Car extends Vehicle {
        private int maxSpeed = 210;

        public void display() {
            System.out.println("Car speed is \t :" + this.maxSpeed);
            System.out.println("Vehicle speed is \t :" + super.maxSpeed);
            super.message();
            this.message();
        }

        @Override
        public void message() {
            System.out.println("Hello Car");
        }
    }
    class Vehicle {
        public int maxSpeed = 180;

        public void display() {
            System.out.println();
        }

        public void message() {
            System.out.println("Car Speed");
        }
        void message(int a)  //methodoverloading
        {
            System.out.println();
        }
    }


