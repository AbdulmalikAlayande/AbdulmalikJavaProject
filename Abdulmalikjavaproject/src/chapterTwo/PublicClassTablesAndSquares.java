package chapterTwo;

public class PublicClassTablesAndSquares {
    public static void main(String[] args) {
        int number1 = 1;
        int numberSquared = number1*number1;
        int numberCube = numberSquared*number1;

        int number2 = 2;
        int squareOfNumber2 = number2*number2;
        int cubeOfNumber2 = number2*number2*number2;

        int number3 = 3;
        int squareOfNumber3 = number3*number3;
        int cubeOfNumber3 = squareOfNumber3*number3;

        int number4 = 4;
        int squareOfNumber4 = number4*number4;
        int cubeOfNumber4 = squareOfNumber4*number4;

        int number5 = 5;
        int squareOfNumber5 = number5*number5;
        int cubeOfNumber5 = squareOfNumber5*number5;

        int number6 = 6;
        int squareOfNumber6 = number6*number6;
        int cubeOfNumber6 = squareOfNumber6*number6;

        int number7 = 7;
        int squareOfNumber7 = number7*number7;
        int cubeOfNumber7 = squareOfNumber7*number7;

        int number8 = 8;
        int squareOfNumber8 = number8*number8;
        int cubeOfNumber8 = squareOfNumber8*number8;

        int number9 = 9;
        int squareOfNumber9 = number9*number9;
        int cubeOfNumber9 = squareOfNumber9*number9;

        int number10 = 10;
        int squareOfNumber10 = number10*number10;
        int cubeOfNumber10 = squareOfNumber10*number10;

        System.out.printf("%10s%30s%26s","number","numberSquared","numberCube");
        System.out.printf("%n%10d%24d%26d",number1,numberSquared,numberCube);
        System.out.printf("%n%10d%24d%26d",number2,squareOfNumber2,cubeOfNumber2);
        System.out.printf("%n%10d%24d%26d",number3,squareOfNumber3,cubeOfNumber3);
        System.out.printf("%n%10d%24d%26d",number4,squareOfNumber4,cubeOfNumber4);
        System.out.printf("%n%10d%24d%26d",number5,squareOfNumber5,cubeOfNumber5);
        System.out.printf("%n%10d%24d%26d",number6,squareOfNumber6,cubeOfNumber6);
        System.out.printf("%n%10d%24d%26d",number7,squareOfNumber7,cubeOfNumber7);
        System.out.printf("%n%10d%24d%26d",number8,squareOfNumber8,cubeOfNumber8);
        System.out.printf("%n%10d%24d%26d",number9,squareOfNumber9,cubeOfNumber9);
        System.out.printf("%n%10d%24d%26d",number10,squareOfNumber10,cubeOfNumber10);

    }
}
