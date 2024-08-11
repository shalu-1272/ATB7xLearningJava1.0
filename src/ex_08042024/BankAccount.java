package ex_08042024;

import com.sun.security.jgss.GSSUtil;

public class BankAccount {
//creating a blueprint
    //instance variable
    long accountNumber;
    String bankName;
    int balance;

    //DEFAULT CONSTRUCTOR
    BankAccount()
    {
        System.out.println("Bank Account Creation has been initiated");
        bankName = "HDFC";
        balance = 0;
        accountNumber = 1000098776;
    }

    //PARAMETERIZED CONSTRUCTOR
    BankAccount(String name, long accountNo, int bal )
    {
        this.bankName = name;
        this.balance = bal;
        this.accountNumber = accountNo;
    }

    void printDetails()
    {
        //function to print details
        System.out.println("Bank Name \t" + bankName);
        System.out.println("Balance \t" + balance);
        System.out.println("Account Number \t" + accountNumber);
    }

}
