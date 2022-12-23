package chapterTwo;

public class Human {
    private String name;
    private int age;
    private int height;
    private double weight;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getHeight() {
        return height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
}