import java.time.LocalDate;

public class DateArithmetic {
    public static void main(String[] args) {
        // Input date
        LocalDate inputDate = LocalDate.of(2023, 1, 1);
        System.out.println("Original Date: " + inputDate);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = inputDate.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After Adding 7 Days, 1 Month, and 2 Years: " + updatedDate);

        // Subtract 3 weeks
        LocalDate finalDate = updatedDate.minusWeeks(3);
        System.out.println("After Subtracting 3 Weeks: " + finalDate);
    }
}
