package ex_08112024.excarabstraction;

abstract class Car extends Engine{
//Engine , GearBox, Keys

    //Tesla IS A car - inheritance


    @Override
    void start() {
        System.out.println("Open Car");
    }

    @Override
    void stop() {
        System.out.println("Stop the Car");
    }

    @Override
    void partGearbox() {
        System.out.println("Part of GB");

    }

    @Override
    void openCar() {
        System.out.println("Open with Keys");
    }
}
