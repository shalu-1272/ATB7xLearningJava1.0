package ex_08112024.excarabstraction;

public class Tesla extends Engine {
    //public static void main(String[] args) {

    void drive()
    {
        openCar();
        start();
        partGearbox();
        stop();
        speed();
    }

    @Override
    void start() {
        System.out.println("Start Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stop Tesla");
    }

    @Override
    void speed() {
        System.out.println("140km/hr");
    }

    @Override
    void partGearbox() {
        System.out.println("Partof GearBox");

    }

    @Override
    void openCar() {
        System.out.println("Open with Keys");
    }

    }

