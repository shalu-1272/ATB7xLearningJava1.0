package ex_08112024.multipleinheritanceusinginterface.ex1;

public class Son implements Mother,Father {

    @Override
    public void home() {
        System.out.println("Sone is completing this incomplete method and therefore this is just 1 function");
    }

    @Override
    public void money() {

    }
}
