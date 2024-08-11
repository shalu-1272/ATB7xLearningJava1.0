package ex_08042024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab135 {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
       /* System.out.println(b1.accountNumber);
        System.out.println(b1.bankName);
        System.out.println(b1.balance); */

       // BankAccount ICICI = new BankAccount("ICICI",100067457, 897809);
      /*  System.out.println(ICICI.bankName);
        System.out.println(ICICI.accountNumber);
        System.out.println(ICICI.balance); */
        // BankAccount()
        //if we want user input then
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details");
        System.out.println("Enter the BANK NAME");
        String name = sc.next();
        System.out.println("Enter the BALANCE");
        int bal = sc.nextInt();
        System.out.println("Enter the ACCOUNT NUMBER");
        long accountNo = sc.nextLong();

        BankAccount ICICI = new BankAccount(name,accountNo,bal);

        b1.printDetails();
        System.out.println();
        ICICI.printDetails();

    }
}
