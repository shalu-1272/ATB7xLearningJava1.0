package ex_08112024.statickeyword;

import java.sql.SQLOutput;

public class Lab154 {
    //Static - Block, Data Members, Function, Class
    public static void main(String[] args) {
        ATB atb = new ATB("shaloo");
        System.out.println(ATB.courseName);
        System.out.println(atb.getName());
        ATB.doAssignment();
    }
}

class ATB
{
    {
        System.out.println("IIB"); //called as soon as object is created
    }
    static
    {
        System.out.println("Load the class and I will be called");
    }
    private String name;
    static String courseName = "ATB";


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ATB(String name) {
        this.name = name;
    }

    static void doAssignment()
    {
        System.out.println("Do Assignement");
    }
}

