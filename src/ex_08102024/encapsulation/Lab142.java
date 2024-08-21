package ex_08102024.encapsulation;

public class Lab142 {
    public static void main(String[] args) {

        ICICI bank = new ICICI("admin", 1000000);
        //bank ref cannpt access any of the data members as of now because those are private

        //getter setter have been applied
        bank.setBalance(10000000, false);

        ICICI admin = new ICICI("Shaloo", 100);
        admin.setBalance(50000000,true);
        System.out.println(admin.getBalance());



    }
}