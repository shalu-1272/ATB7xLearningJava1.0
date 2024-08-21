package ex_08102024.encapsulation;

public class ICICI {
    private String name;
    private long balance;

    public ICICI(String name, long balance) {
        this.name = name;
        this.balance = balance;
    }
    public String getName() {
        return name;
    }

    public void setName(String name, boolean isAuth) {
        if (isAuth) {
            this.name = name;
        } else {
            System.out.println("Not allowed");
        }
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isAuth) {
        if (isAuth) {
            this.balance = balance;
        }
        else
        {
            System.out.println("Not allowed");
        }
}}
