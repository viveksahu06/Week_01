import java.util.Scanner;
public class ReverseAStrings{
	 // Method to Reverse A Strings
    public static String reverseAString(String text){
		
		StringBuilder reverseString=new StringBuilder();
	
		 // Iterate through the string to check each character
		for(int i=text.length()-1;i>=0;i--){
			reverseString.append(text.charAt(i));
		}
		
		return reverseString.toString();
	}

   public static void main(String [] args){
		// Create a Scanner object to take input from the user
		Scanner input = new Scanner(System.in);

		
		
		//take input from the user
		System.out.print("Enter a string: ");
        String text = input.nextLine();
		
		// remove extra space
		text=text.trim();
		
		// Call the method to Reverse A Strings
        String reversed=reverseAString(text);
		
		System.out.println("Reserved string  :" + reversed);
		
		input.close();


	}
}