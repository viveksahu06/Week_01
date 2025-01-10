public class CheckSpringSeason {
    public static void main(String[] args) {
       // 2 input by command line by user
        if (args.length != 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }
        
        // Parse the month and day from the command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);
        
        // Check if the month and day fall within the Spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || 
            (month == 4) || 
            (month == 5) || 
            (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
