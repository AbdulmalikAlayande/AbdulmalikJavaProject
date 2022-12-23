package chapterTwo;

import java.util.Scanner;
//here the firstDigit,firstNumber,and the firstInteger are all the same I just made them different so teh code will run
// also the secondDigit, secondInteger, secondNumber are all the same I just made them different so the code will run
public class ArithmeticChapter2No14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first integer");
        int firstInteger = input.nextInt();

        System.out.println("enter second integer");
        int secondInteger = input.nextInt();

        int result = (firstInteger*firstInteger);
        System.out.println("the result of first integer square is: "+result);

        result = (secondInteger*secondInteger);
        System.out.println("the result of the square of second integer is: "+result);

        System.out.println("enter first digit");
        int firstDigit = input.nextInt();

        System.out.println("enter second digit");
        int secondDigit = input.nextInt();

        int solution = (firstDigit*firstDigit) + (secondDigit*secondDigit);
        System.out.println("the sum of their square is: "+solution);

        System.out.println("enter first number");
        int firstNumber = input.nextInt();

        System.out.println("enter second number");
        int secondNumber = input.nextInt();

        int answer = (firstNumber*firstNumber) - (secondNumber*secondNumber);
        System.out.println("the result of their square is: "+answer);
    }
}