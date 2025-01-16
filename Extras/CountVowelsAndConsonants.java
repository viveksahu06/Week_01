import java.util.Scanner;
public class CountVowelsAndConsonants{
	 // Method to count vowels and consonants
    public static void countVowelsAndConsonants(String text){
		int countVowel=0;
		int countConsonants=0;
		
		text=text.toLowerCase();
		
		 // Iterate through the string to check each character
		for(int i=0;i<text.length();i++){
			char ch=text.charAt(i);
			
			 // Check if the character is an alphabetic character or not
			if(Character.isLetter(ch)){
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    countVowel++;
                } else {
                    countConsonants++;
                }
			}
		}
		
		System.out.println("Number of Vowels: " + countVowel + "Number of Consonants: " + countConsonants);
	}

   public static void main(String [] args){
		// Create a Scanner object to take input from the user
		Scanner input = new Scanner(System.in);

		
		
		//take input from the user
		System.out.print("Enter a string: ");
        String text = input.nextLine();
		
		// remove extra space
		text=text.trim();
		
		// Call the method to count vowels and consonants
        countVowelsAndConsonants(text);
		
		input.close();


	}
}