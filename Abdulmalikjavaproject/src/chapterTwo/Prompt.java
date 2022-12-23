package chapterTwo;

    import java.util.Scanner;

    public class Prompt {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number in pounds: ");
        double numInPonds = input.nextDouble();

        double result = (numInPonds*0.454);
            System.out.println("the equivalent in kg is: " +result);


        


    }
}
