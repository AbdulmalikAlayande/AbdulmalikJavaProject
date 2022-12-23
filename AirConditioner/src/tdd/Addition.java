package tdd;

import java.util.Scanner;

public class Addition {
    Scanner scanner = new Scanner(System.in);
    private int sum;

    public void add(int num1, int num2) {
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum = num1 + num2;
    }

    public int getAdd() {
        return sum;
    }
}
