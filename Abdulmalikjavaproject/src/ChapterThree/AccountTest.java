package ChapterThree;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
         Account customer1 = new Account();
        Scanner customerInput = new Scanner(System.in);

        customer1.getAccountName();
        System.out.println("dear customer your accountName is: "+customer1.getAccountName());

        double malik = customer1.getAccountBalance();
        System.out.println("your account balance: "+ malik);

        customer1.getAccountNumber();
        System.out.println("your account number: "+customer1.getAccountNumber());

        customer1.getPin();
        System.out.println("your pin is: "+customer1.getPin());

        System.out.println("enter your account Name");
        String yourName = customerInput.nextLine();
        customer1.setAccountName(yourName);
        String name = customer1.getAccountName();
        System.out.println("your account name is: "+name);

        customer1.setAccountNumber("2210785731");
        customer1.getAccountNumber();
        System.out.println("dear "+name+" your account number is "+customer1.getAccountNumber());

        customer1.setPin("1968");
        customer1.getPin();
        System.out.println("dear "+name+" your account pin is "+customer1.getPin());


        System.out.println("dear "+name+" please enter the amount you want to deposit");
        double howMuch = customerInput.nextDouble();
        customer1.deposit(howMuch);
        customer1.getAccountBalance();
//        System.out.println("you have deposited "+howMuch+" and your balance is "+customer1.getAccountBalance());

        System.out.println("dear "+name+" please enter the amount you want to deposit");
        howMuch = customerInput.nextDouble();
        customer1.deposit(howMuch);
        customer1.getAccountBalance();
//        System.out.println("you have deposited "+howMuch+" and your balance is "+customer1.getAccountBalance())

        System.out.println("dear "+name+" please enter the amount you want to withdraw");
        howMuch = customerInput.nextDouble();
        customer1.withdraw(howMuch);
        customer1.getAccountBalance();
        //System.out.println("you have withdrawn "+howMuch+" and your balance is "+customer1.getAccountBalance());


        System.out.println("dear "+name+" please enter the amount you want to withdraw");
        howMuch = customerInput.nextDouble();
        customer1.withdraw(howMuch);
        customer1.getAccountBalance();
        //System.out.println("you have withdrawn "+howMuch+" and your balance is "+customer1.getAccountBalance());



    }

}
