package ChapterThree;

public class HealthProfile {

    private String patientFirstName;
    private String patientLastName;
    private String patientGender;
    private  String patientDateOfBirth;
    private String patientDayOfBirth;
    private String patientMonthOfBirth;
    private int patientYearOfBirth;
    private  double patentHeightInInches;
    private  double patientWeightInPounds;

    public HealthProfile(String firstName, String lastName, String gender, String dateOfBirth, String day, String month, int year, double height, double weight){
        patientFirstName = firstName;
        patientLastName = lastName;
        patientGender = gender;
        patientDateOfBirth = dateOfBirth;
        patientDayOfBirth = day;
        patientMonthOfBirth = month;
        patientYearOfBirth = year;
        patentHeightInInches = height;
        patientWeightInPounds = weight;
    }



    public void setPatientFirstName(String patientFirstName) {
                this.patientFirstName = patientFirstName;
            }

                public String getPatientFirstName() {
                    return patientFirstName;
                }
                        public void setPatientLastName(String patientLastName) {
                            this.patientLastName = patientLastName;
                        }

                                public String getPatientLastName() {
                                    return patientLastName;
                                }
                                        public void setPatientGender(String patientGender) {
                                            this.patientGender = patientGender;
                                        }
                                                public String getPatientGender() {
                                                    return patientGender;
                                                }
                                                        public void setPatientDateOfBirth(String patientDateOfBirth) {
                                                            this.patientDateOfBirth = patientDateOfBirth;
                                                        }

                                                                public String getPatientDateOfBirth() {
                                                                    return patientDateOfBirth;
                                                                }

                                                                        public void setPatientDayOfBirth(String patientDayOfBirth) {
                                                                            this.patientDayOfBirth = patientDayOfBirth;
                                                                        }

                                                                                public String getPatientDayOfBirth() {
                                                                                    return patientDayOfBirth;
                                                                                }

                                                                                public void setPatientMonthOfBirth(String patientMonthOfBirth) {
                                                                                    this.patientMonthOfBirth = patientMonthOfBirth;
                                                                                }
                                                                        public String getPatientMonthOfBirth() {
                                                                            return patientMonthOfBirth;
                                                                        }

                                                                public void setPatientYearOfBirth(int patientYearOfBirth) {
                                                                    this.patientYearOfBirth = patientYearOfBirth;
                                                                }
                                                        public int getPatientYearOfBirth() {
                                                            return patientYearOfBirth;
                                                        }

                                                public void setPatentHeightInInches(double patentHeightInInches) {
                                                    this.patentHeightInInches = patentHeightInInches;
                                                }
                                        public double getPatentHeightInInches() {
                                            return patentHeightInInches;
                                        }

                                public void setPatientWeightInPounds(double patientWeightInPounds) {
                                    this.patientWeightInPounds = patientWeightInPounds;
                                }
                        public double getPatientWeightInPounds() {
                            return patientWeightInPounds;
                        }
                public int age(){
                    int currentYear = 2022;
                    int age = currentYear - patientYearOfBirth;
                    return age;
                }

            public double BMI(){
                double BMI = (patientWeightInPounds * 703)/(patentHeightInInches*patentHeightInInches);
                return BMI;
            }
        public double maximumHeartRate(){
            double maximumHeartRate = 220 - age();
            return maximumHeartRate;
        }
    public double targetHeartRange(){
        double targetHeartRate = (76/100) * maximumHeartRate();
        return targetHeartRate;
    }

}
