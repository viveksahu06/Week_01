import java.util.Scanner;
public class FindSubstringOccurrences{
	// Method to find the Substring Occurrences in a string

	public static int countSubString(String str,String subString){
		int count=0;

		for(int i=0;i<=str.length()-subString.length();i++){
			if(str.substring(i,i+subString.length()).equals(subString)){
				count++;
			}
			
		}
		
		
		// Return the result

		return count;
	}
	public static void main(String [] args){
		        // Input a string from the user

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str=input.nextLine();
		
		System.out.println("Enter a sub String");
		String subString=input.next();
		
		
		str=str.trim();
		subString=subString.trim();
		
		// Find and display the longest word
        int occurrences = countSubString(str, subString);
        System.out.println("The substring \"" + subString + "\" occurs " + occurrences + " times in the string.");

        input.close();

		
	}
	
}