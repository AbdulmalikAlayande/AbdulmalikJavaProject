package tdd;

public class WorldPopulationGrowthRateCalculator {
    public static void main(String[] args) {
        double currentWorldPopulation = 7837000000.0;
        double annualGrowthRate = (0.9/100);

        double growthRateIn2021 = annualGrowthRate * currentWorldPopulation;
        double worldPopulationIn2022 = growthRateIn2021 + currentWorldPopulation;

        double growthRateIn2022 = annualGrowthRate * worldPopulationIn2022;
        double worldPopulationIn2023 = growthRateIn2022 + worldPopulationIn2022;

        double growthRateIn2023 = annualGrowthRate * worldPopulationIn2023;
        double worldPopulationIn2024 = growthRateIn2023 + worldPopulationIn2023;

        double growthRateIn2024 = annualGrowthRate * worldPopulationIn2024;
        double worldPopulationIn2025 = growthRateIn2024 + worldPopulationIn2024;

        System.out.printf("%5s%25s%35s%n", "Year ", "growthRate", " worldPopulation");
        System.out.println();
        System.out.printf("%5s%25s%30s%n", "2022 ", growthRateIn2021, worldPopulationIn2022);
        System.out.printf("%5s%25s%30s%n", "2023 ", growthRateIn2022, worldPopulationIn2023);
        System.out.printf("%5s%25s%30s%n", "2024 ", growthRateIn2023, worldPopulationIn2024);
        System.out.printf("%5s%25s%30s%n", "2025 ", growthRateIn2024, worldPopulationIn2025);


//        System.out.printf("%5s%10s%n", "                2021                ",                  annualGrowthRate   );


    }
}














//   private double worldPopulation;
//    public WorldPopulationGrowthRateCalculator(double worldPopulation){
//        this.worldPopulation = worldPopulation;
//    }
//
//
//    public void calculateWorldPopulationAfter5Years() {
//
//    }

