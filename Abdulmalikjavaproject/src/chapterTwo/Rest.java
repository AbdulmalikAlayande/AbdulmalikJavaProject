package chapterTwo;

import java.util.Scanner;

public class Rest {
//    private String sleep;
//    private String nap;
//    private String siesta;

    public static void main(String[] args) {
        Scanner best = new Scanner(System.in);
        System.out.println("enter your grade");
        double grade = best.nextDouble();
        if (grade >= 90) System.out.println("A");
            else
            if (grade >= 80) System.out.println("B");
                else
                if(grade >= 70) System.out.println("C");
                    else
                    if(grade >= 60) System.out.println("D");
                    else
                        if (grade >= 50) System.out.println("E");
                            else System.out.println("you are a failure, YOU ARE A FAILURE,YOU CAN NEVER MAKE IT!!!");

        }

    }

