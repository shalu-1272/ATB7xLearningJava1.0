package ex_07202024;

public class Lab067 {
    public static void main(String[] args) {
        //can we have 2 cases with same name - not possible

        //if JDK > 13 the we can use multiple conditions together
        int itemcode = 006;
        switch(itemcode)
        {
            case 001, 002, 003:
                System.out.println("M");
            case 004, 005, 006:
                System.out.println("E");
            default:
                System.out.println("None");
        }
    }
}
