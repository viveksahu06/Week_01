/*Write a program to demonstrate NullPointerException. 
Hint => 
Write a Method to generate the Exception. Here define the variable text and initialize it to null. Then call one of the String Method to generate the exception
Write the Method to demonstrate NullPointerException. Here define the variable text and initialize it to null. Then write try catch block for handling the Exception while accessing one of the String method
From the main Firstly call the method to generate the Exception then refactor the code to call the method to handle the RuntimeException
*/
public class ShowingNullPointerException {

    public void generateException() {
        String text = null;
        System.out.println("Attempting to get the length of a null string");
        System.out.println(text.length()); // throw NullPointerException
    }

    public void demonstrateNullPointerException() {
        String text = null;
        try {
            // Attempting to call a String method
            System.out.println("Attempting to get the length of a null string");
            System.out.println(text.length());
        } catch (NullPointerException e) {
            // Handling the exception
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        ShowingNullPointerException example = new ShowingNullPointerException();

        System.out.println("Calling generateException()");
        try {
            example.generateException();
        } catch (NullPointerException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }

        // Calling the method that handles NullPointerException
        System.out.println("\nCalling demonstrateNullPointerException()");
        example.demonstrateNullPointerException();
    }
}
