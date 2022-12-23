package ChapterThree;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int petrolQuantityInLitres;
    private double pricePerLitre;
    private double percentageDiscount;

   public PetrolPurchase(){}



    public PetrolPurchase(String location, String type, int quantity, double price, double discount){
        stationLocation = location;
        petrolType = type;
        petrolQuantityInLitres = quantity;
        pricePerLitre = price;
        percentageDiscount = discount;
    }
    public void setStationLocation(String location){
        stationLocation = location;
    }
    public String getStationLocation() {
        return stationLocation;
    }
    public void setPetrolType(String type){
        petrolType = type;
    }
    public String getPetrolType() {
        return petrolType;
    }
    public void setPetrolQuantityInLitres(int quantity) {
        petrolQuantityInLitres = quantity;
    }
    public int getPetrolQuantityInLitres() {
        return petrolQuantityInLitres;
    }
    public void setPricePerLitre(double price) {
        pricePerLitre = price;
    }
    public double getPricePerLitre() {
        return pricePerLitre;
    }
    public void setPercentageDiscount(double discount) {
       percentageDiscount = discount;
   }
    public double getPercentageDiscount() {
        return percentageDiscount;
    }
    public double getPurchaseAmount(){
        double initialPrice = 700;
        double finalPrice = 500;
        percentageDiscount = ((initialPrice - finalPrice)/(initialPrice))*100;
        double netAmount = (petrolQuantityInLitres * pricePerLitre) - percentageDiscount;
        return netAmount;
    }
}
