package chapterTwo;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner calculate = new Scanner(System.in);

        System.out.println("enter first character:");
        int firstCharacter = calculate.nextInt();

        System.out.println("enter second character: ");
        int secondCharacter = calculate.nextInt();

        System.out.println("enter third character: ");
        int thirdCharacter = calculate.nextInt();

        int result = (firstCharacter*secondCharacter)/(2*thirdCharacter);

        System.out.printf("%d%n", result);




    }
}
