package ex_08112024.Interface;

public class Lab152 {
    //Interface - used to hide the implementation like abstract
    //interface is the keyword and it's variables will be inherited by subclasses
    public static void main(String[] args) {
        WagonR wagon = new WagonR();
        wagon.stopEngine();
        wagon.startEngine();
    }

}
