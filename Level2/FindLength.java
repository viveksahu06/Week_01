import java.util.Scanner;

public class FindLength{

    public static String getUserInput(Scanner input,String message){
		System.out.println(message);
		return input.nextLine();
	} 
    // Method to find and return the length of a string without using length()
    public static int getStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    public static void main(String[] args) {
        // declaring a Scanner class to take a input
		Scanner input= new Scanner(System.in);
	
		// call a getUserInput method for take input from the user for string 1
		String text=getUserInput(input, "Enter a  String");
		
		//removing extra space from string
		text=text.trim();
		
	    // call a subString method to get result using charAt method
		int customLnegth=getStringLength(text);	
		
		
		// checking strings using In Build method of java string subString methods
		int builtInLnegth=text.length();
		
		
		System.out.println("the Length using custom method "+ customLnegth +".\nthe length using buildin method " + builtInLnegth);

        input.close();
    }
}