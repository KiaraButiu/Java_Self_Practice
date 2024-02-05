package day06_method;

public class DayAndMonth {
    public static void main(String[] args) {
        System.out.println(day(5));

        System.out.println(monthName(6));

        System.out.println(monthName(6) + " has " + daysInMonth(6) + " days");
    }
    public static String day(int day) {
        String result = " ";
        switch (day) {
            case 1 -> result = "Monday";
            case 2 -> result = "Tuesday";
            case 3 -> result = "Wednesday";
            case 4 -> result = "Thursday";
            case 5 -> result = "Friday";
            case 6 -> result = "Saturday";
            case 7 -> result = "Sunday";
            default -> result = "Invalid Number";
        }
        return result;
    }

    public static String monthName(int month) {
        String result = " ";
        switch (month) {
            case 1 -> result = "January";
            case 2 -> result = "February";
            case 3 -> result = "March";
            case 4 -> result = "April";
            case 5 -> result = "May";
            case 6 -> result = "June";
            case 7 -> result = "July";
            case 8 -> result = "August";
            case 9 -> result = "September";
            case 10 -> result = "October";
            case 11 -> result = "November";
            case 12 -> result = "December";
            default -> result = "Invalid Number";
        }
        return result;
    }
    public static String daysInMonth (int daysInMonth){
        String result;
        switch (daysInMonth) {
            case 1 -> result = "31";
            case 2 -> result = "28";
            case 3 -> result = "31";
            case 4 -> result = "30";
            case 5 -> result = "31";
            case 6 -> result = "30";
            case 7 -> result = "31";
            case 8 -> result = "31";
            case 9 -> result = "30";
            case 10 -> result = "31";
            case 11 -> result = "30";
            case 12 -> result = "31";
            default -> result = "Invalid Number";
        }
        return result;
    }


}


