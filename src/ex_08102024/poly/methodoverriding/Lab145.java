package ex_08102024.poly.methodoverriding;

public class Lab145 {
    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();

        Dog d1 = new Dog();
        d1.bark();

        Dog doge_ref = new Hound();
        doge_ref.bark();
    }
}
