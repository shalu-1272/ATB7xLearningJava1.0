package ex_08112024.Interface;

public class WagonR implements Engine {
    void drive() {
        startEngine();
        stopEngine();
    }

    @Override
        public void startEngine () {
            System.out.println("WagonR starting");
        }

        @Override
        public void stopEngine () {
            System.out.println("WagonR stopping");

    }
}
