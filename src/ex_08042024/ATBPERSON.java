package ex_08042024;

public class ATBPERSON {
    String name;  //default is null
    long phone;  //default is 0

    //Default Constructor
    ATBPERSON()
    {
        System.out.println("Object Created");
    }
    //parameterized constructor
    ATBPERSON(String nameGiven)   //nameGiven needs to be assigned to String name
    {
        this.name = nameGiven;
       //his.phone = "750337865";

    }
    ATBPERSON(String nameGiven, long phoneNumber){

this.name = nameGiven;
this.phone = phoneNumber;
}

}