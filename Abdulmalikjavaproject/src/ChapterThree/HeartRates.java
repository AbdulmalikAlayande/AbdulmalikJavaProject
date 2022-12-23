package ChapterThree;

public class HeartRates {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String day;
    private String month;
    private int year;

        public HeartRates(String firstName, String lastName, String dateOfBirth, String day,String month,int year){
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBirth = dateOfBirth;
            this.day = day;
            this.month = month;
            this.year = year;
    }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }
        public void setDay(String day) {
            this.day = day;
        }

        public String getDay() {
            return day;
        }

        public void setMonth(String month) {
            this.month = month;
        }

        public String getMonth() {
            return month;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public int getYear() {
            return year;
        }
        public int age(){
            int currentYear = 2022;
            int userAge = currentYear - year;
            return userAge;
        }
        public double displayMaximumHeartRate(){
            double maximumHeartRate = 220 - age();
            return maximumHeartRate;
        }
        public double displayTargetHeartRate(){
            double targetHeartRate = (76.0/100.0)*displayMaximumHeartRate();
            return targetHeartRate;
        }
}
