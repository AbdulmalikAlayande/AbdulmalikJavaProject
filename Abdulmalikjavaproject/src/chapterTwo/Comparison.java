package chapterTwo;

import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner compare = new Scanner(System.in);

        System.out.println("Enter a first number");
        int firstNumber = compare.nextInt();

        System.out.println("Enter a second number");
        int secondNumber = compare.nextInt();

        if (firstNumber == secondNumber){System.out.println("firstNumber is equal to secondNumber");}
        else {System.out.println("firstNumber is not equal to secondNumber");}
        if (firstNumber > secondNumber){System.out.println("firstNumber is greater than secondNumber");}
        else  {System.out.println("firstNumber is greater than secondNumber");}
        if (firstNumber >= secondNumber){System.out.println("firstNumber >= secondNumber");}
        if (firstNumber <= secondNumber){System.out.println("firstNumber <= secondNumber");}
    }
}
