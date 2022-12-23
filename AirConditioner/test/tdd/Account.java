package tdd;

public class Account {
    private String name;
    private String accountNumber;
    private double balance;
    private int pin;


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void deposit (double amount) {
       if (amount >= 50) balance += amount;
       else System.out.println("you cannot deposit amount less than #50.0");
    }
    public void withdraw(double amount){
       if (amount <= balance) balance -= amount;
       if (amount > balance) System.out.println("you cannot withdraw more than you have in your account");
       if (amount <= 0) System.out.println("you cannot withdraw amount less than or equal to zero");

    }
    public double getBalance() {
        return balance;
    }
}
