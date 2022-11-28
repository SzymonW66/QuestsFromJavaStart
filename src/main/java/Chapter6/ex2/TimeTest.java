package Chapter6.ex2;

public class TimeTest {

    public static void main(String[] args) {
        TimeConventer timeConventer = new TimeConventer();
        int hours = 10;
        int minutes = timeConventer.hoursToMin(hours);
        System.out.println("10 hours it's " + minutes + " minutes");
        int seconds = timeConventer.minutesToSec(minutes);
        System.out.println(minutes + " minutes it's " + seconds + " seconds");
        int miliseconds = timeConventer.secondsToMilsec(seconds);
        System.out.println(seconds + " seconds it's " + miliseconds + " miliseconds");
    }
}
