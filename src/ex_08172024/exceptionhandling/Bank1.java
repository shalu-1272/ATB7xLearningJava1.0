package ex_08172024.exceptionhandling;

public class Bank1 {
    private String currency;
    private int amount;

    public Bank1(String currency, int amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public int getAmount() {
        return amount;
    }

    public Integer add(Bank1 bankName)
    {
        if(!bankName.currency.equalsIgnoreCase("INR"))
        {
            try {
                throw new Exception("Incorrect Currency");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        Integer sum = this.amount + bankName.amount;
         return sum;
    }
}
