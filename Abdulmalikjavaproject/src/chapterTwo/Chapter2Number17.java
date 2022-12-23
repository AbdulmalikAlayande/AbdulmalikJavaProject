package chapterTwo;

import java.util.Scanner;

public class Chapter2Number17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first integer");
        int firstInteger = input.nextInt();

        System.out.println("enter secondInteger");
        int secondInteger = input.nextInt();

        System.out.println("enter thirdInteger");
        int thirdInteger = input.nextInt();

        int sum = firstInteger + secondInteger + thirdInteger;
        System.out.println("their sum is: " + sum);

        int average = (firstInteger + secondInteger + thirdInteger) / 3;
            System.out.println("their average is: " + average);

        int product = (firstInteger * secondInteger * thirdInteger);
            System.out.println("their product is: " + product);

        if (firstInteger < secondInteger && firstInteger < thirdInteger) {
            System.out.println("first integer is smallest");

        } else if (secondInteger < firstInteger && secondInteger < thirdInteger)
                System.out.println("second integer is smallest");

        else  {
            System.out.println("third integer is smallest");
        }

        if (firstInteger > thirdInteger && firstInteger > secondInteger){
            System.out.println("first integer is largest");
        }
        else if (secondInteger > firstInteger && secondInteger > thirdInteger) {
            System.out.println("second integer is largest");
        }
        else {
            System.out.println("third integer is largest");
        }
    }

}

