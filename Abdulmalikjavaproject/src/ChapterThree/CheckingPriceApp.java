package ChapterThree;

public class CheckingPriceApp {
    public static void main(String[] args) {

    }

    public static class Baby {
        private int age;
        private int weightInKg;
        private String name;

        public Baby(int babyWeightAtBirth){
            weightInKg = babyWeightAtBirth;
        }


        public String getName() {
            return name;
        }

        public int getAge(){
            return age;
        }

        public int getWeight() {
            return weightInKg;
        }

        public Baby(){

        }

        public int getWeightInKg() {
            return 0;
        }
    }
}


