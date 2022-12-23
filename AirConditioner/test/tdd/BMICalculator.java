package tdd;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        System.out.println("enter your weight in pounds");
        double weightInPounds = input.nextDouble();

        System.out.println("enter your height in inches");
        double heightInInches = input.nextDouble();

        double BMI = (weightInPounds * 703)/(heightInInches * heightInInches);
        System.out.printf("%n%s%f","your body mass index is: ", BMI);
        System.out.println();

        if (BMI < 18.5) {
            System.out.println("According to the National Heart Lung And Blood Institute (NHLBI), A BMI below 18.5 shows that you are under weight ");
            System.out.println("The value of your BMI shows that you are underweight");
        } else if (18.5 <= BMI && BMI <= 24.9) {
            System.out.println("The value of your BMI IS "+BMI+" the value of your body mass index shows that you are at a wealthy weight for your height ");
        }
        else {
            System.out.println("The value of your BMI is "+BMI+" The value of your Body mass index shows that you are obessed");
        }
    }
}
