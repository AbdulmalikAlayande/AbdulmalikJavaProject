package chapterTwo;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter firstNumber");
        int firstNumber = input.nextInt();

        System.out.println("enter secondNumber");
        int secondNumber = input.nextInt();

        int cubeOfFirstNumber = (firstNumber*firstNumber*firstNumber);

        int squareOfSecondNumber = (secondNumber*secondNumber);

        if (cubeOfFirstNumber % squareOfSecondNumber == 0){
            System.out.println("cube of firstNumber is a multiple of the square of secondNumber");
        }
        else {
            System.out.println("cube of firstNumber is not a multiple of the square of secondNumber");
        }
    }
}
