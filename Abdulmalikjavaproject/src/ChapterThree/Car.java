package ChapterThree;

public class Car {
    private String car1Model;
    private String yearOfProductionOfCar1;
    private double car1Price;

    public Car(String model, String year, double price){
        car1Model = model;
        yearOfProductionOfCar1 = year;
        car1Price = price;
    }
    public void setCar1Model(String model) {
        car1Model = model;
    }
    public String getCar1Model() {
        return car1Model;
    }
    public void setYearOfProductionOfCar1(String year) {
        yearOfProductionOfCar1 = year;
    }
    public String getYearOfProductionOfCar1() {
        return yearOfProductionOfCar1;
    }
    public void setCar1Price(double price) {
        car1Price = price;
        if (price <= 0) System.out.println("invalid amount");
    }
    public double getCar1Price() {
        return car1Price;
    }

    private String car2Model;
    private String yearOfProductionOfCar2;
    private double car2Price;

    public Car(String model2, double price2, String yearOfCar2){
        car2Model = model2;
        yearOfProductionOfCar2 = yearOfCar2;
        car2Price = price2;
    }
    public void setCar2Model(String model2) {
        car2Model = model2;
    }
    public String getCar2Model() {
        return car2Model;
    }
    public void setYearOfProductionOfCar2(String yearOfCar2) {
        yearOfProductionOfCar2 = yearOfCar2;
    }
    public String getYearOfProductionOfCar2() {
        return yearOfProductionOfCar2;
    }
    public void setCar2Price(double Price2) {
        car2Price = Price2;
    }
    public double getCar2Price() {

        return car2Price;
    }
    public void percentageDiscount(){
        car1Price = 1750000.0;
        car2Price = 3000000.0;
        double fivePercentDiscountOnCar1 = (5.0/100.0)*car1Price;
        System.out.println("the five percent discount on this car price is: "+fivePercentDiscountOnCar1);
        double sevenPercentDiscountOnCar2 = (7.0/100.0)*car2Price;
        System.out.println("the seven percent discount on this car price is: "+sevenPercentDiscountOnCar2);
        double finalPriceOfCar1 = car1Price - fivePercentDiscountOnCar1;
        double finalPriceOfCar2 = car2Price - sevenPercentDiscountOnCar2;
        System.out.println("the discounted price of "+car1Model+" is now: "+finalPriceOfCar1);
        System.out.println("the discounted price of "+car2Model+" is now: "+finalPriceOfCar2);

    }



}
