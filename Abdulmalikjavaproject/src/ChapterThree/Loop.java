package ChapterThree;

import java.util.Scanner;

public class Loop{
	public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//		for (int goat = 0; goat <= 100; goat++){
//            		if (goat % 2 == 0){
//                		System.out.println(goat+" is a multiple of 2");
//                		}
//                 	else if (goat == 0){
//                System.out.println(goat+" is not a multiple of two");
//                 }
//            else {
//                             System.out.println(goat+" is not a multiple of two");
//            }
//     }
//        int num = 3;
//        while (num <= 100){
//            num*=3;
//            num++;
//        }
//        System.out.println(num);

//        /
        for (int outer = 1; outer <= 8; outer++)
        {
            for (int inner = 1; inner<=outer; inner++)
                System.out.print("$");
            System.out.println();
        }
        int sum = 0;
        int counter = 1;
        for (;counter <= 10;){
            System.out.print(counter+ " enter number ");
            int grade = scanner.nextInt();
            counter++;
            sum+=grade;
            System.out.println(sum);
        }
}
}