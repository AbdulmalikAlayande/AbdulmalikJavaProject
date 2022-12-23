package ChapterThree;

public class CarApplication {
    public static void main(String[] args) {
        System.out.println();
        Car firstCar = new Car("Lamborghini Aventador  Ultimae Roadster 2dr Convertible AWD (6.5L 12cyl 7AM).", "2022", 546847.00);
        System.out.println("The car's name and model is: "+firstCar.getCar1Model());
        System.out.println("It's year of production is "+firstCar.getYearOfProductionOfCar1());
        System.out.println("The car's price is about: US$"+firstCar.getCar1Price());

        System.out.println();

        firstCar.setCar1Model("Ferrari Monza SP2");
        String model = firstCar.getCar1Model();
        System.out.println(model);

        firstCar.setYearOfProductionOfCar1("2022");
        String year = firstCar.getYearOfProductionOfCar1();
        System.out.println(year);

        firstCar.setCar1Price(1750000.0);
        double price = firstCar.getCar1Price();
        System.out.println("$"+price);

        System.out.println();
        System.out.println();

        Car secondCar = new Car("Koenigsegg Jekso Absolut", 3000000.00, "2022");
        System.out.println(secondCar.getCar2Model());
        System.out.println("$"+secondCar.getCar2Price());
        System.out.println(secondCar.getYearOfProductionOfCar2());

        System.out.println();

        secondCar.setCar2Model("Hennessey Venom F5");
        String model2 = secondCar.getCar2Model();
        System.out.println(model2);

        secondCar.setCar2Price(3000000.00);
        double price2 = secondCar.getCar2Price();
        System.out.println("$"+price2);

        secondCar.setYearOfProductionOfCar2("2022");
        String year2 = secondCar.getYearOfProductionOfCar2();
        System.out.println(year2);

        System.out.println();

        firstCar.percentageDiscount();
        //System.out.println(firstCar.percentageDiscount());

        secondCar.percentageDiscount();
        //System.out.println(secondCar.percentageDiscount());



    }
}
