package ex_08172024.WrapperClass;


import ex_08172024.exceptionhandling.Bank1;

public class Lab161 {
    public static void main(String[] args) {
        Bank1 sbi = new Bank1("INR",100);
        Bank1 icici= new Bank1("INR", 200);
        Bank1 jpmorgan= new Bank1("USD", 20);

        Integer totalbal = sbi.add(icici);
        System.out.println(totalbal);
        Integer totalbal1 = sbi.add(jpmorgan);
        System.out.println(totalbal1);



    }
}
