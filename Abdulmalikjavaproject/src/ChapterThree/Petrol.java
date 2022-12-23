package ChapterThree;

public class Petrol {
    public static void main(String[] args) {

        PetrolPurchase customer1 = new PetrolPurchase();
        System.out.println(customer1.getStationLocation());
        System.out.println(customer1.getPetrolType());
        System.out.println(customer1.getPetrolQuantityInLitres());
        System.out.println(customer1.getPricePerLitre());
        System.out.println(customer1.getPercentageDiscount());
        System.out.println();

        PetrolPurchase customer3 = new PetrolPurchase("Abuja","kerosene",45,500.0,500-((20.0/100.0)*(500.0)));
        System.out.println(customer3.getStationLocation());
        System.out.println(customer3.getPetrolType());
        System.out.println(customer3.getPetrolQuantityInLitres()+" litres");
        System.out.println("#"+customer3.getPricePerLitre());
        System.out.println("#"+customer3.getPercentageDiscount());

        customer3.setStationLocation("Abule Egba");
        String location = customer3.getStationLocation();
        System.out.println("the petrol station location is at: "+location);

        customer3.setPetrolType("diesel");
        String type = customer3.getPetrolType();
        System.out.println(type);

        customer3.setPetrolQuantityInLitres(45);
        int quantity = customer3.getPetrolQuantityInLitres();
        System.out.println("the petrol quantity is "+quantity+" liters" );

        customer3.setPricePerLitre(700.0);
        double price = customer3.getPricePerLitre();
        System.out.println("the price per litre of "+type+" is "+price);

        customer3.setPercentageDiscount(28.57/100);
        double discount = customer3.getPercentageDiscount();
        System.out.println("the percentage discount is "+discount);

        customer3.getPurchaseAmount();
        System.out.printf("%s%s%.2f%n","the net amount is: ","#",customer3.getPurchaseAmount());


    }
}
