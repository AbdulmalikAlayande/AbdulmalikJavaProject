package chapterTwo;

import java.util.Scanner;

// this program performs a single payroll calculation
public class Assignment2Number7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter an integer");
        int b = input.nextInt();

        System.out.print("enter an integer");
        int c = input.nextInt();

        int a = b * c;
        System.out.print("the result is: " +a);
    }
}
