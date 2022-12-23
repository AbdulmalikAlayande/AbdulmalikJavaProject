package chapterTwo.account;

public class Account {
    private String accountName;
    private String accountNumber;
    private double balance;

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    private String pin;

    public Account(){}
    public Account (String accountName, String accountNumber){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }
    public Account(String accountName, String accountNumber, double balance){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Account (String accountName, String accountNumber, double balance, String pin){
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.pin = pin;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public void deposit(double howMuch){
       if (howMuch >= 50) balance += howMuch;
       else {
           System.out.println("you cannot deposit less than #50.0");
       }
    }


    //public void withdraw(double howMuch){
       // if(howMuch >= balance) System.out.println("Insufficient fund");
      //      balance -= howMuch;
    //    }
  //  }
    public void withdraw(double howMuch){
    if (howMuch > 0)   balance -= howMuch;
    else System.out.println("you cannot withdraw any amount less than 0 or 0");
    if (howMuch > balance) System.out.println("Ole ni e seh, wo you cannot collect more than you have in your account o");
   }
    public double getBalance() {
        return balance;
    }


}
