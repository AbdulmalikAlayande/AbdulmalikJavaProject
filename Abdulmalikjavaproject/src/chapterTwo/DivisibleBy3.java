package chapterTwo;

import java.util.Scanner;

public class DivisibleBy3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter an integer");
        int integer = input.nextInt();

        if (integer % 3 == 0) {
            System.out.println("integer is divisible by 3");
        }
        if (integer % 3 != 0){
            System.out.println("integer is not divisible by 3");
        }
    }
}
