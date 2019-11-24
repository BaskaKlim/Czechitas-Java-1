package cz.czechitas.kalendar;

public class SpousteciTrida {

    public static void main(String[] args) {
        Datum today = new Datum();
          today.setDay(9);
          today.setMonth(11);
          today.setYear(2020);


        System.out.println(today);
        System.out.println("Month: " + today.getMonthName());
        System.out.println("Is this year leap year?: " + today.getIsLeapYear(today.getYear()));


        Datum thisChrismas = new Datum();
        thisChrismas.setYear(2019);
        thisChrismas.setMonth(12);
        thisChrismas.setDay(24);
        System.out.println(thisChrismas);

        Datum thisSilvester = new Datum();
        thisSilvester.setYear(2019);
        thisSilvester.setMonth(12);
        thisSilvester.setDay(31);
        System.out.println(thisSilvester);

        if (thisChrismas.getMonth() == thisSilvester.getMonth()) {
            System.out.println("Vanoce a Silvestr jsou ve stejnem mesici.");
        } else {
            System.out.println("Vanoce a Silvestr NEJSOU ve stejnem mesici.");
        }

        System.out.println();

        Datum wrongMonth = new Datum();
        wrongMonth.setYear(2020);
        wrongMonth.setMonth(13);
        wrongMonth.setDay(11);
        System.out.println(wrongMonth);

        Datum wrongMonthTwo = new Datum();
        wrongMonthTwo.setYear(2021);
        wrongMonthTwo.setMonth(-1);
        wrongMonthTwo.setDay(5);
        System.out.println(wrongMonthTwo);

        Datum wrongDay = new Datum();
        wrongDay.setYear(2022);
        wrongDay.setMonth(12);
        wrongDay.setDay(40);
        System.out.println(wrongDay);


        Datum wrongDayTwo = new Datum();
        wrongDayTwo.setYear(2023);
        wrongDayTwo.setMonth(3);
        wrongDayTwo.setDay(-2);
        System.out.println(wrongDayTwo);
    }
}

