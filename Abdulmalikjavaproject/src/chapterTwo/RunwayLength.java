package chapterTwo;

import java.util.Scanner;

public class RunwayLength{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a takeOffSpeed in m/s: ");
        double takeOffSpeed = input.nextDouble();
        System.out.println();

        System.out.print("Enter another number m/s^2: ");
        double acceleration = input.nextDouble();
        System.out.println();

        double minimumRunwayLength = (takeOffSpeed*takeOffSpeed)/(2*acceleration);
        //System.out.printf("%f%s%n", minimumRunwayLength);
        System.out.println("Minimum Runway Length is: "+ minimumRunwayLength+ "m");



    }


    }





