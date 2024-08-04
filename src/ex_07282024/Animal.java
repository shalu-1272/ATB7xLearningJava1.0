package ex_07282024;

public class Animal {

    String name = "LOl";
    String breed;
    int age;

    void walk()
    {

    }
    void sleep()
    {

    }

    public static void main(String[] args) {
        //I can use the main function within the class
        Animal animalref = null;
        Animal animal = new Animal();  //
        animal.name = "Dog";
        Animal animalref1 = new Animal();
        Animal animalref2 = new Animal();
        Animal animalref3 = animalref2;  //animalref3 points to already created ref animalref2
        System.out.println(animalref1.name);
    }
}
