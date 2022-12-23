package ChapterThree;

public class Clock {
    private int hour;
    private int minutes;
    private  int seconds;
    private int total;

             public Clock (int hour, int minutes, int seconds){
                     this.hour = hour;
                     this.minutes = minutes;
                     this.seconds = seconds;
             }

             public void setHour(int hour) {
                     this.hour = hour;
             }

             public int getHour() {
                     if (hour > 23) {
                         this.hour = 0;
                     }
                     else if (hour < 1) {
                         this.hour = 0;
                     }
                     else {
                         this.hour = hour;
                     }
                        return hour;
             }

             public void setMinutes(int minutes) {
                     this.minutes = minutes;
                    }

             public int getMinutes() {
                     if (59 >= minutes && 1 <= minutes){
                         this.minutes = minutes;
                     }
                     else {
                         this.minutes = 0;
                     }
                         return minutes;
             }
             public void setSeconds(int seconds) {
                     this.seconds = seconds;
             }

            public int getSeconds() {
                    if (1 <= seconds && 59 >= seconds) {
                         this.seconds = seconds;
                    }
                    else {
                         this.seconds = 0;
                    }
                         return seconds;
            }

            public void displayTime(){
                System.out.println(hour+":"+minutes+":"+seconds);
            }


}
