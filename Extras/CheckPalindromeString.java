import java.util.Scanner;
public class CheckPalindromeString{
	// Method to check if the string is a palindrome
	public static boolean isPalindrome(String text){
		int left=0;
		int right=text.length()-1;
	
		 // Iterate through the string to check each character
		while(left<right){
			if(text.charAt(left)!=text.charAt(right)){
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}

   public static void main(String [] args){
		// Create a Scanner object to take input from the user
		Scanner input = new Scanner(System.in);

		
		
		//take input from the user
		System.out.print("Enter a string: ");
        String text = input.nextLine();
		
	// Remove extra spaces and convert to lowercase 
		text=text.trim().toLowerCase();
		
		// Call the method isPalindrome
        boolean isPalindrome=isPalindrome(text);
		if(isPalindrome){
			System.out.println( text+ " It is Palindrome String");
		}else{
			System.out.println(text+ " It is not Palindrome String");
		}
		input.close();


	}
}