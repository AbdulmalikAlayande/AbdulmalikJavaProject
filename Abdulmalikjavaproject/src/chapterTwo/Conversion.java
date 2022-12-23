package chapterTwo;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number in feet");
        double yourInput = input.nextDouble();

        double convertToMeters = (yourInput * 0.305);
        System.out.println("the equivalent in meters is: "+convertToMeters);

    }
}
