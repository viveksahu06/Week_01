import java.util.Scanner;
public class LongestWordinString{
	// Method to find the longest word in a string

	public static String longestWord(String str){
		String longestWord=" ";
		StringBuilder currentWord=new StringBuilder();

		for(int i=0;i<=str.length();i++){
			if(i==str.length()|| str.charAt(i)==' '){
				if(currentWord.length()>longestWord.length()){
					 longestWord = currentWord.toString();
				}
				currentWord.setLength(0);
			}else{
				currentWord.append(str.charAt(i));
			}
		}
		// Return the longest word found

		return longestWord;
	}
	public static void main(String [] args){
		        // Input a string from the user

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str=input.nextLine();
		str=str.trim();
		
		// Find and display the longest word
        String longestWord = longestWord(str);
        System.out.println("The longest word is: " + longestWord);

		
	}
	
}