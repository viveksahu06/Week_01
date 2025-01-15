import java.util.Scanner;

public class TextSplitAndLength1D {
	
	public static String getUserInput(Scanner input,String message){
		System.out.println(message);
		return input.next();
	} 
	
	 public static int calculateLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }
	
    // Method to split text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        // Count the number of words first
        int length = calculateLength(text);
        int wordCount = 1;

        // Count words by checking spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];
        int wordIndex = 0, start = 0;

        // Extract words using indexes
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(start, i);
                start = i + 1;
            }
        }
        // Add the last word
        words[wordIndex] = text.substring(start);

        return words;
    }
	public static boolean toCompare(String [] arr1,String[] arr2){
		// comparing a arr1 and arr2 using charAt method
		if(arr1.length!=arr2.length){
			return false;
		}else{
			for(int i=0;i<arr1.length;i++){
				if(arr1[i]!=arr2[i]){
					return false;
				}
			}
		}
		//return a boolean value
		return true;
	}
    public static void main(String[] args) {
        // declaring a Scanner class to take a input
		Scanner input= new Scanner(System.in);
	
		// call a getUserInput method for take input from the user for string 
		String text=getUserInput(input, "Enter a  String");
		
		//removing extra space from string
		text=text.trim();
		
	     // Get characters using the user-defined method
		String [] customMethods=splitTextIntoWords(text);	
		
		
		// Get characters using the built-in toCharArray() method
		String [] buildInMethods=text.split(" ");
		
		
		// call a toComapre methods for checking string are same or not
		boolean resultUsingToCampare=toCompare(customMethods,buildInMethods);
		System.out.println("Custom Split Words:");
		
		if(resultUsingToCampare){
			System.out.println("Custom and Build in methods are same ");
		}else{
		    System.out.println("Custom and Build in methods are not same ");
		}
		
        input.close();
    }
}
