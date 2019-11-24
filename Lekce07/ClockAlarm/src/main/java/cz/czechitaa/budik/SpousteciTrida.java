package cz.czechitaa.budik;

import java.util.*;

public class SpousteciTrida {

    public static void main(String[] args) {
        Scanner keyboardScanner = new Scanner(System.in);
        stopwatch myStopwatch = new stopwatch();

        while ((keyboardScanner.nextLine().isEmpty())) {
            myStopwatch.AddSec();

            System.out.println("Alarm " + myStopwatch.getHour() + " : " +
            myStopwatch.getMinute() + " : " + myStopwatch.getSecond());
        }
    }

}
