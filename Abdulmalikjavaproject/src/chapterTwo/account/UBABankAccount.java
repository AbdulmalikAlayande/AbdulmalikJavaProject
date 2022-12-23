package chapterTwo.account;

public class UBABankAccount {
    private String accountName;
    private String bankName;
    private String accountNumber;
    private double accountBalance;
    private String pin;


    public UBABankAccount(){}

    public UBABankAccount(String myName){
       accountName = myName;
    }
    public UBABankAccount(String myName, String myBankName){
        accountName = myName;
        bankName = myBankName;
    }
    public UBABankAccount(String myAccountName,String myBankName, String myAccountNumber){
        accountName = myAccountName;
        bankName = myBankName;
        accountNumber = myAccountNumber;
    }
    public UBABankAccount(String myAccountName, String myBankName, String myAccountNumber,double myAccountBalance) {
        accountName = myAccountName;
        bankName = myBankName;
        accountNumber = myAccountNumber;
        accountBalance = myAccountBalance;
    }
    public UBABankAccount(String myAccountNumber, String myBankName, String myAccountName, double myAccountBalance, String myPin){
       accountName = myAccountName;
       bankName = myBankName;
       accountNumber = myAccountNumber;
       accountBalance = myAccountBalance;
       pin = myPin;
    }
    public String getAccountName(){
        return accountName;
    }
    public String getBankName() {
        return bankName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }
    public String getPin() {
        return pin;
    }
}
