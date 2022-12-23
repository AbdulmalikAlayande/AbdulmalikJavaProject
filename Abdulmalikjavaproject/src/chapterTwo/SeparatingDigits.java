package chapterTwo;

import java.util.Scanner;

public class SeparatingDigits {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("enter any five digits number of your choice ");
        int fiveDigits = userInput.nextInt();
        int firstDigit = fiveDigits/10000;
        int secondDigit = (fiveDigits/1000) % 10;
        int thirdDigit = ((fiveDigits/100) % 100) % 10;
        int fourthDigit = ((((fiveDigits/10) % 1000) % 100) % 10);
        int fifthDigit = ((((fiveDigits % 10000) % 1000) % 100) % 10);

        if (fiveDigits < 10000) System.out.println("you were asked to input five digit number");
        else if (fiveDigits > 99999) {
            System.out.println("you were asked to input five digit number");
        }
        else System.out.printf("%d%3d%3d%3d%3d%n", firstDigit,secondDigit,thirdDigit,fourthDigit,fifthDigit);


    }
}
