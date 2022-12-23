package ChapterThree;

public class Account {
    private String accountName;
    private double accountBalance;
    private String pin;
    private String accountNumber;

    public void setAccountName(String yourName) {
        accountName = yourName;
    }
    public String getAccountName() {
        return accountName;
    }
    public void deposit(double howMuch){
       if(howMuch > 0.0) {
           accountBalance += howMuch;
        System.out.println("you have deposited "+howMuch+" and your balance is "+accountBalance);
       }

       if(howMuch <= 0.0) {
           System.out.println("invalid deposit amount");
       }
    }
    public void withdraw(double howMuch){
        if (howMuch > 0 && howMuch <= accountBalance){
            accountBalance -= howMuch;
            System.out.println("dear " + accountName + " you have withdrawn " + howMuch + " and your balance is " + accountBalance);
        } else if (howMuch <= 0) {
            System.out.println("invalid withdraw amount");
        }
        if (howMuch > accountBalance) {
            System.out.println("invalid withdraw amount");
        }

    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public void setPin(String yourPin) {
        pin = yourPin;
    }
    public String getPin() {
        return pin;
    }
    public void setAccountNumber(String yourAccountNumber) {
        accountNumber = yourAccountNumber;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
}
