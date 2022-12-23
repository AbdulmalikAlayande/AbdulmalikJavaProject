package chapterTwo;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//// so this first two are just to remind us and make us a little bie familiar with looping.
        for ( int deck2 = 1; deck2 <= 10; deck2++){
            System.out.print(deck2+", ");
        }
        System.out.println();
        for (int number = 0; number<=100;number++){
            System.out.println("welcome "+number);
        }
/*for this example we are trying to add all the numbers between and including 1 and 10, so what we did was; addition is initialized to 0 and the deck1
is starting from 1 to 10, so it follows that starting from 1, 0 + 1 = 1 which implies that addition is now equal to 1 and the deck1++ comes in,
it changes the value of deck1 to 2 then we have, 2+1 = 3, then addition is now 3 and the deck1++ comes in again and changes the value of deck1 to 3
then we have, 3+3 = 6 then addition is now 6, so this goes on and on with the value of deck1 changing Subsequentially till it gets to 10 and then terminate
because any number bigger than 10 is no more true, so we represent it mathematically below
            addition + deck1 = addition
                0    +  1    =     1
                1    +  2    =     3
                3    +  3    =     6
                6    +  4    =    10
                10   +  5    =    15
                15   +  6    =    21
                21   +  7    =    28
                28   +  8    =    36
                36   +  9    =    45
                45   +  10   =    55 and that how it goes SE ACABO!!! */

        int addition = 0, deck1 = 1;
            while (deck1 <= 10){
                addition += deck1;
                    deck1++;
        }
                    System.out.println(addition);
                    System.out.println();


// finding factorial with loop
// using for loop for the question
        System.out.println("enter any number");
            int multiplier = 1;
                for (int numb = input.nextInt(); numb >= 1; numb--){
                    multiplier*=numb;
        }
                        System.out.println("the factorial is "+multiplier);
                        System.out.println();
//Another question.
                            System.out.println("enter a number");
                                int num1;
                            num1 = input.nextInt();
                        int times = 1;
                    while (num1 >= 1){
                times*=num1;
            num1--;
        }
        System.out.println(times);

        /* using while loop for the question
when the user enters a number "num" since num is greater than or equal to 1, it follows that num can be any number greater than one and num can also
be 1, the "multiply*=num" implies that multiply is equal to multiply * num, for instance; if num is equal to 2 then multiply is equal to 1*9 = 9, since we
initialized multiply to 1, then the "num--" does the work, it follows all the values lower than 9 sequentially till it gets to 1 and terminate because
anything less than 1 is no more true.
 for example; 1*9=9
              9*8=72
              72*7=504
              504*6=3024
              3024*5=15120
              15120*4=60480
              60480*3=181440
              181440*2=362880
              362880*1=362880 */

        System.out.println("enter a number");
            int num;
                num = input.nextInt();
                    int multiply = 1;
                        while (num >= 1) {
                            multiply *= num;
                            num--;
                        }
                    System.out.println("the factorial is "+multiply);
                System.out.println();
// another one 2
        System.out.println("enter the first number you entered ");
        num1 = input.nextInt();
        System.out.println("enter the second number you entered");
        num = input.nextInt();
        int back = num1 - num;
        int timesIt = 1;
        while (back >= 1){
            timesIt*=back;
            back--;
        }
        System.out.println(timesIt);

//to calculate the combination i.e 9C8 (9 combination 8)
       int combination = (times)/((timesIt)*multiply);
       System.out.println("the combination value is: "+combination);

//to calculate the permutation i.e 9P8 (9 permutation 8)
        int permutation = (times)/(timesIt);
        System.out.println("the permutation value is: "+permutation);






    }
}
