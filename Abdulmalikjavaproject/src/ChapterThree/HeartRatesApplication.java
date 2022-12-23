package ChapterThree;

import java.util.Scanner;

public class HeartRatesApplication {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
            HeartRates user1 = new HeartRates("Alayande", "Abdulmalik", "30-december-2001", "30", "December", 2001);
                System.out.printf("%s%s%n", user1.getFirstName(),user1.getLastName());
                System.out.println(user1.getDateOfBirth());
                System.out.println(user1.getDay());
                System.out.println(user1.getMonth());
                System.out.println(user1.getYear());


                    System.out.println("enter your first name");
                    String name = userInput.nextLine();

                    System.out.println("enter your last name");
                    String lastname = userInput.nextLine();

                    System.out.println("enter your day of birth i.e(day = 29)");
                    String day = userInput.nextLine();

                    System.out.println("enter your month of birth");
                    String month = userInput.nextLine();

                    System.out.println("enter your year of birth");
                    int year = userInput.nextInt();

                    user1.setFirstName(name);
                    user1.setLastName(lastname);
                    user1.setDay(day);
                    user1.setMonth(month);
                    user1.setYear(year);

                    System.out.println("Full Name: "+user1.getFirstName()+" "+user1.getLastName());
                    System.out.println("Date Of Birth in the format DD:MM:YY ; "+user1.getDay()+":"+user1.getMonth()+":"+user1.getYear());
                    System.out.println("User age "+user1.age());
                    System.out.println("Maximum heart rate: "+user1.displayMaximumHeartRate());
                    System.out.println("Target Heart Rate Range is: "+user1.displayTargetHeartRate());
//                    System.out.println("enter your date of birth in this format DD:MM:YY");
//                    String DOB = userInput.nextLine();
                    //String input = user1.getFirstName();
                    //String input2 = user1.getLastName();
                    //String input = user1.getFirstName();
                    //String input3 = user1.getDay();
                    //String input4 = user1.getMonth();
                    //int input5 = user1.getYear();
//                    user1.setDateOfBirth(DOB);
//                    String input6 = user1.getDateOfBirth();
//                    System.out.println(input4);
//                    System.out.println(input5);
//                    System.out.println(input6);

    }
}
