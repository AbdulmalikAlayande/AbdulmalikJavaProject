package chapterTwo;

public class HumanTest {
    public static void main(String[] args) {
        Human Abdulmalik = new Human();


        String name = Abdulmalik.getName();
        System.out.println("your initial name is: "+name);


        int age = Abdulmalik.getAge();
        System.out.println("your age(in yrs) at birth is : "+age);


        int height = Abdulmalik.getHeight();
        System.out.println("your height(in meters) at birth is about ");
    }
}