import java.util.Scanner;

public class  ConvertToUpperCase{
	
	public static String getUserInput(Scanner input,String message){
		System.out.println(message);
		return input.nextLine();
	} 
	// declaring a substring method
	public static String convertToUpperCase(String text){
		
		StringBuilder result=new StringBuilder();
		
		// substring using charAt method
			for(int i=0;i<text.length();i++){
				char ch = text.charAt(i);
				if (ch >= 'a' && ch <= 'z') {
					result.append((char)(ch-32));
				}else{
					result.append(ch);
				}
			}
		
		//return a boolean value
		return result.toString();
	}
	// declaring a toComapre method
	public static boolean toCompare(String str1,String str2){
		// checking a str1 and str2 using charAt method
		if(str1.length()!=str2.length()){
			return false;
		}else{
			for(int i=0;i<str1.length();i++){
				if(str1.charAt(i)!=str2.charAt(i)){
					return false;
				}
			}
		}
		//return a boolean value
		return true;
	}
	public static void main (String [] args){
		
		// declaring a Scanner class to take a input
		Scanner input= new Scanner(System.in);
	
		// call a getUserInput method for take input from the user for string 1
		
		String text=getUserInput(input, "Enter a  String");
		
		//removing extra space from string
		text=text.trim();
		
	    // call a subString method to get result using charAt method
		String customUpperCase=convertToUpperCase(text);	
		
		
		// checking strings using In Build method of java string subString methods
		String builtInUpperCase=text.toUpperCase();
		
		
		// call a toComapre methods for checking string are same or not
		boolean resultUsingToCampare=toCompare(customUpperCase,builtInUpperCase);
		
		// displaying result
		if(resultUsingToCampare){
			System.out.println(" Uppercase String using user define method "+customUpperCase+" Uppercase String using build-in method " +builtInUpperCase+ " are same ");
		}else{
			System.out.println(" Uppercase String Using user define method "+customUpperCase+" Uppercase String using build-in method " +builtInUpperCase+ " are not same ");
		}
	}
	
}