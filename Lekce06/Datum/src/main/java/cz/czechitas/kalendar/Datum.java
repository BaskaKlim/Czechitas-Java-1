package cz.czechitas.kalendar;

import java.time.*;

public class Datum {

    private int year;
    private int month;
    private int day;

    public String toString() {
        return "Datum " + day + ". " + getMonthName() + " " + year + "\n";
    }

    public void setYear(int newValue) {
        if (newValue >= 2019) {
            year = newValue;
        } else {
            System.out.println("You cant travel back in time! Please set the year again");
        }
    }

    public void setMonth(int newValue) {
        if (newValue >= 1 && newValue <= 12) {
            month = newValue;
        } else {
            System.out.println("Value of month " + newValue + " is not valid.");
        }
    }

    public void setDay(int newValue) {
        if (newValue >= 1 && newValue <= 31) {
            day = newValue;
        } else {
            System.out.println("Are you from another Gallaxy? We have just 31 days in one months! ");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getMonthName() {
        if (month == 1) {
            return "January";
        }
        if (month == 2) {
            return "February";
        }
        if (month == 3) {
            return "March";
        }
        if (month == 4) {
            return "April";
        }
        if (month == 5) {
            return "May";
        }
        if (month == 6) {
            return "June";
        }
        if (month == 7) {
            return "July";
        }
        if (month == 8) {
            return "August";
        }
        if (month == 9) {
            return "September";
        }
        if (month == 10) {
            return "October";
        }
        if (month == 11) {
            return "November";
        }
        if (month == 12) {
            return "December";
        }
        return "Wrong value of month";
    }

    public static boolean getIsLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}

