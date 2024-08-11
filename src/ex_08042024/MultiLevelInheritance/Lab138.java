package ex_08042024.MultiLevelInheritance;

public class Lab138 {
    public static void main(String[] args) {
        //multi level inheritance
        //Grandfather - > Father -> Son

        Son s = new Son();
        s.home();

        //Priority is given to local - home is available in child 3 BHK
        //If son doesn't have a house then it takes from Father and if father doesn't have then it can take from GF
    }
}
