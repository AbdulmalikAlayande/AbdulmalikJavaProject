package chapterTwo;
//import Math;
import java.util.Scanner;

public class Chapter2Number28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter the radius of the circle");
        double radius = input.nextDouble();

        double diameterOfCircle = 2 * radius;
        System.out.printf("%s%f%n","the diameter of the circle is: ", diameterOfCircle);

        double circumferenceOfCircle = 2 * Math.PI * radius;
        System.out.printf("%s%f%n","the circumference of the circle is: ", circumferenceOfCircle);

        double areaOfCircle = Math.PI * radius*radius;
        System.out.printf("%s%f%n","the area of the circle is: ", areaOfCircle);


    }
}
