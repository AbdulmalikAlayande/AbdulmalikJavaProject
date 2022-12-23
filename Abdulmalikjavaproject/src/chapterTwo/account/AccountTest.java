package chapterTwo.account;

import chapterTwo.account.Account;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Account customer1Details = new Account();

        System.out.println("Dear customer your account name is: "+customer1Details.getAccountName());
        System.out.println("Dear new customer please enter your name");
        String name = input.nextLine();
        customer1Details.setAccountName(name);
        name = customer1Details.getAccountName();
        System.out.println("dear new customer your account name is: "+name);


        customer1Details.setAccountNumber("2210785731");
        customer1Details.getAccountNumber();
        System.out.println("Dear "+name+" your account number is: "+customer1Details.getAccountNumber());


        System.out.println("Dear "+name+" please enter the amount you want to deposit");
        double howMuch = input.nextDouble();
        customer1Details.deposit(howMuch);
        double balance= customer1Details.getBalance();
        System.out.println("Dear "+name+" you have deposited: "+howMuch+ "and your balance is: " +balance);


        System.out.println("Dear "+name+" customer please enter the amount you want to deposit");
        howMuch = input.nextDouble();
        customer1Details.deposit(howMuch);
        balance= customer1Details.getBalance();
        System.out.println("Dear "+name+ " you have deposited: "+howMuch+ "and your balance is: " +balance);


        System.out.println("Dear "+name+" enter the amount you want withdraw ");
        howMuch = input.nextDouble();
        customer1Details.withdraw(howMuch);
        balance = customer1Details.getBalance();

    }
}
