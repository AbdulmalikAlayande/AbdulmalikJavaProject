package ChapterThree;

import java.util.Scanner;

public class Account2Test {
    public static void main(String[] args) {


       Scanner scanner = new Scanner(System.in);


//        Account2 customer1 = new Account2();
//        Account2 customer2 = new Account2();

        Account2 customer1 = new Account2("Abdumalik", 90);
        Account2 customer2 = new Account2("Omo Ibadan", 100);

        System.out.printf("%s%n%s%n", customer1.getName(), customer2.getName());
        System.out.println();

        System.out.printf("%.2f%n%.2f%n", customer1.getBalance(), customer2.getBalance());
        System.out.println();

        System.out.println("Enter customer 1 name");
        String name = scanner.nextLine();
        customer1.setName(name);
        name = customer1.getName();
        System.out.printf("%s%n%s%n", "customer1 name is: "  ,name);
    }
}





