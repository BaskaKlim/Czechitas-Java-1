package cz.czechitaa.budik;

public class stopwatch {

    int second;
    int minute;
    int hour;

    public void AddSec() {
        if (second < 60) {
            second += 1;
        } else if (minute < 60) {
            minute += 1;
            second = 0;
        } else {
            hour += 1;
            minute = 0;
            second = 0;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getSecond() {
        return second;
    }

    public int getMinute() {
        return minute;
    }
}

