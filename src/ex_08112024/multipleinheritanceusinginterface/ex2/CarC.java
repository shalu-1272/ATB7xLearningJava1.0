package ex_08112024.multipleinheritanceusinginterface.ex2;

public class CarC implements E{

    @Override
    public void startEngine() {

    }

    @Override
    public void haltEngine() {
        E.super.haltEngine();
    }

    @Override
    public void stopEngine() {

    }
}
