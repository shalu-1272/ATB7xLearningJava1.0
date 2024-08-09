package ex_08042024;

public class Lab133 {
    public static void main(String[] args) {
     //   ATBPERSON p0 = new ATBPERSON();
        ATBPERSON p1 = new ATBPERSON("Shaloo");
        ATBPERSON p2 = new ATBPERSON("Amit");
        ATBPERSON p3 = new ATBPERSON("Vriti",760986723);
       // new ATBPERSON(); //no ref but object created
        //new ATBPERSON(); //no ref but object created
        //till now 3 objects are created 2 w/o ref
       // ATBPERSON p2 = null;  //not an object creation. object only creates with new keyword
      //  p1.name = "Amit"; //we are assigning after the object is created
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.phone);
      //  System.out.println(p0.name);

    }
}
