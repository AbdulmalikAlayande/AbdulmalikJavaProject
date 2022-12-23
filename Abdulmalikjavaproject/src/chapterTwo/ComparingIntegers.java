package chapterTwo;

import java.util.Scanner;

public class ComparingIntegers {

        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter a number");

        int number = input.nextInt();

        int numberSquared = number*number;

            if (number == 100) {
                System.out.println(number + " is equal to 100");
            }
            else {
                System.out.println(number+ "is not equal to 100");
            }
            if (numberSquared == 100) {
                System.out.println(numberSquared + " is equal to 100");
            }
            else {
                System.out.println(numberSquared + " is not equal to 100");
            }

            if (number > 100 ){
                System.out.println(number+" is greater than 100");
            }
            else {
                System.out.println(number+" is less than 100");
            }

            if (numberSquared > 100 ){
                System.out.println(numberSquared+" is greater than 100");
            }
            else {
                System.out.println(numberSquared+ " is less than 100");
            }

        }
}
