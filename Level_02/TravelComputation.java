import java.util.Scanner;

class TravelComputation {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // Get the name of the person
      System.out.print("Enter the name of the traveler: ");
      String name = sc.nextLine();
      
      // Get the cities involved in the travel
      System.out.print("Enter the from city: ");
      String fromCity = sc.nextLine();
      
      System.out.print("Enter the via city: ");
      String viaCity = sc.nextLine();
      
      System.out.print("Enter the to city: ");
      String toCity = sc.nextLine();

      // Get the distances
      System.out.print("Enter the distance from " + fromCity + " to " + viaCity + ": ");
      double distanceFromToVia = sc.nextDouble();
      
      System.out.print("Enter the distance from " + viaCity + " to " + toCity + ": ");
      double distanceViaToFinalCity = sc.nextDouble();

      // Get the times
      System.out.print("Enter the time from " + fromCity + " to " + viaCity + " (in minutes): ");
      int timeFromToVia = sc.nextInt();
      
      System.out.print("Enter the time from " + viaCity + " to " + toCity + " (in minutes): ");
      int timeViaToFinalCity = sc.nextInt();

      // Calculate total distance and time
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;
      int totalTime = timeFromToVia + timeViaToFinalCity;

      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and the Total Time taken is " + totalTime + " minutes");

   }
}
