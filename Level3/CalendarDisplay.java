/*Create a program to display a calendar for a given month and year. The program should take the month and year as input from 
the user and display the calendar for that month. E.g. for 07 2005 user input, the program should display the calendar as shown
 below

Hint => 
Write a Method to get the name of the month. For this define a month Array to store the names of the months
Write a Method to get the number of days in the month. For this define a days Array to store the number of days in each month.
 For Feb month, check for Leap Year to get the number of days. Also, define a Leap Year Method. 
Write a method to get the first day of the month using the Gregorian calendar algorithm
y0 = y − (14 − m) / 12
x = y0 + y0/4 − y0/100 + y0/400
m0 = m + 12 × ((14 − m) / 12) − 2
d0 = (d + x + 31m0 / 12) mod 7
Displaying the Calendar requires 2 for loops. 
The first for loop up to the first day to get the proper indentation. As in the example above 3 spaces from Sun to Thu as to 
be set as July 1st starts on Fri
The Second for loop Displays the days of the month starting from 1 to the number of days. Add proper indentation for 
single-digit days using %3d to display the integer right-justified in a field of width 3. Please note to move to the next 
line after Sat
*/
import java.util.Scanner;

public class CalendarDisplay {

    // Array to store the names of the months
    public static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array to store the number of days in each month
    public static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + (31 * m) / 12) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = MONTH_NAMES[month - 1];
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the header
        System.out.println("\n   " + monthName + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // Indent the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((firstDay + day) % 7 == 0 || day == daysInMonth) {
                System.out.println(); // Move to the next line after Saturday or end of month
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input from the user
        System.out.print("Enter month (1-12): ");
        int month = scnextInt();
        System.out.print("Enter year: ");
        int year = scnextInt();

        // Validate input
        if (month < 1 || month > 12 || year < 1) {
            System.out.println("Please enter a valid month (1-12) and year.");
        } else {
            // Display the calendar
            displayCalendar(month, year);
        }

    }
}
