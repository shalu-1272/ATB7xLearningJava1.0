package ex_08112024.multipleinheritanceusinginterface.ex2;

public interface E {
    void startEngine();
    void stopEngine();

    //Complete methods with interfaces are allowed but only with default keyword

    default void haltEngine(){
        System.out.println("Halt");
    }
 //   void m() cannot have complete function w/o default
   // {

    //}
}
