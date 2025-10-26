//input = 08 05 2015 
// output=webnesday


import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class calendar {

    public static String findDay(int month, int day, int year) {
        // Create a Calendar instance
        Calendar calendar = new GregorianCalendar(year, month - 1, day); // month is 0-based in Calendar
        // Get the day of the week
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        // Convert the day of the week to a string
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                return "SUNDAY";
            case Calendar.MONDAY:
                return "MONDAY";
            case Calendar.TUESDAY:
                return "TUESDAY";
            case Calendar.WEDNESDAY:
                return "WEDNESDAY";
            case Calendar.THURSDAY:
                return "THURSDAY";
            case Calendar.FRIDAY:
                return "FRIDAY";
            case Calendar.SATURDAY:
                return "SATURDAY";
            default:
                return ""; // This should never happen
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        // Read the input
        String[] input = scanner.nextLine().split(" ");
        int month = Integer.parseInt(input[0]);
        int day = Integer.parseInt(input[1]);
        int year = Integer.parseInt(input[2]);
        
        // Call the findDay method and print the result
        String dayOfWeek = findDay(month, day, year);
        System.out.println(dayOfWeek);
        
        scanner.close();
    }
}