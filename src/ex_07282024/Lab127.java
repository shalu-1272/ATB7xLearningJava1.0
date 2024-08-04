package ex_07282024;

public class Lab127 {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        Bank bank2 = new Bank();

        //created 2 objects in heap area with ref bank1 and bank2
        bank1.bankName = "HDFC";
        bank1.balance = 20000000;
        bank2.bankName = "ICICI";
        bank2.balance = 15000000;

        System.out.println("Bank Name is:" + '\t' + bank1.bankName + '\n' + "Account balance is:" + '\t' + bank1.balance);
       bank2.balance = 6000;  //can change the value anytime
        System.out.println(bank2.bankName + '\t' + bank2.balance);
    }
}
