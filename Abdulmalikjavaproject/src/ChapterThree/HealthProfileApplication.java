package ChapterThree;

import java.util.Scanner;

public class HealthProfileApplication {
    public static void main(String[] args) {
        Scanner patientInput = new Scanner(System.in);
//        System.out.println("Enter full name");
//        String details = patientInput.nextLine();
        HealthProfile patientInfo = new HealthProfile("AbdulMalik", "Ayalande", "Male", "28/4/2005", "28", "4", 2005,7, 80);
//        patientInfo.getPatientFirstName();
//        patientInfo.getPatientLastName();

        System.out.println(patientInfo.getPatientFirstName() + " "+ patientInfo.getPatientLastName());
        System.out.println(patientInfo.getPatientGender()+ " , " +patientInfo.getPatientDateOfBirth());
        System.out.println(patientInfo.getPatientMonthOfBirth());
        System.out.println(+ patientInfo.getPatentHeightInInches() +" , " +
                patientInfo.getPatientWeightInPounds());
//        patientInfo.getPatientLastName();
//        System.out.println(patientInfo.getPatientLastName());
//        patientInfo.getPatientGender();
//        System.out.println(patientInfo.getPatientGender());
//        patientInfo.getPatientDateOfBirth();
//        System.out.println(patientInfo.getPatientDateOfBirth());
//        patientInfo.getPatientDayOfBirth();
//        System.out.println(patientInfo.getPatientDayOfBirth());
//        patientInfo.getPatientMonthOfBirth();
//        System.out.println(patientInfo.getPatientMonthOfBirth());
//        patientInfo.getPatientYearOfBirth();
//        System.out.println(patientInfo.getPatientYearOfBirth());
//        patientInfo.getPatentHeightInInches();
//        System.out.println(patientInfo.getPatentHeightInInches());
//        patientInfo.getPatientWeightInPounds();
//        System.out.println(patientInfo.getPatientWeightInPounds());

//        System.out.println("enter your first name and last name");
//        String patient = patientInput.nextLine();
//        String fullName = patientInfo.getPatientFirstName() + patientInfo.getPatientLastName();
//        patientInfo.setPatientFirstName(fullName);
//
//
//        System.out.println(fullName);
    }
}
