/*Write a program to convert the complete text to lowercase and compare the results

Hint => 
Take user input using the  Scanner nextLine() method to take the complete text into
 a String variable
Write a method using the String built-in charAt() method to convert each character
 if it is lowercase to the Upper Case. Use the logic ASCII value of 'a' is 97 and
 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is
 66 so the difference is 32, and so on
Write a method to compare two strings using the charAt() method and return a 
boolean result
In the main() use the String built-in method toLowerCase() to get the lowercase 
Text and compare the two strings using the user-defined method. And finally display
 the result
Write a program to split the text into words and return the words along with their
 lengths in a 2D array
*/  
import java.util.Scanner;
public class CompleteLowerCase{
	public static String toLower(String s){
		String lowerString =""; 
		for(int i=0;i<s.length();i++){ 
			char ch =s.charAt(i);
			if(s.charAt(i)>= 'A' && s.charAt(i) <='Z'){
				lowerString+=(char)(ch+32);
			}
			else{
				lowerString+=ch;
			}
		}
		return lowerString;
	} 
	
	
	public static boolean compare2String(String s1, String s2){ 
		if(s1.length() != s2.length()){ 
			return false;
		} 
		for(int i=0;i<s1.length();i++){
			if(s1.charAt(i) != s2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void stringToWords(String s){
		String []str = s.split(" "); 
		//int []length=new int[str.length]; 
		
		// 2D array to store words with its length 
		
		String [][]wordArray = new String [str.length][2]; 
		
		for(int i=0; i<str.length;i++){
			wordArray[i][0]= str[i];
		}
		
		for(int i=0; i<str.length;i++){
			wordArray[i][1]= Integer.toString(str[i].length());
		} 
		
		
		//printting the array 
		
		for(int i=0;i<str.length;i++){
			
			System.out.println("Word is " + wordArray[i][0] +" and length is " + wordArray[i][1]);
			
		}
		
	}
	
	
	public static void main(String []args){
		//Scanner class
		Scanner sc = new Scanner(System.in); 
		//input the string
		System.out.print("Enter a String: "); 
		String inputStr = sc.nextLine(); 
		//converting lower case using built in function
		String lowerString = inputStr.toLowerCase();
		//printing the result into lowercase
		String lower=toLower(inputStr);
		
		System.out.println(lower);  
		
		System.out.println(lowerString); 
		//comparison two strings using the user-defined method
		if(compare2String(lower, lowerString)){ 
			System.out.println("After comparison result is same"); 
		}
		else{
			System.out.println("After comparison result is not same"); 
		}
		
		//printing the string with its corrousponding words and with length
		stringToWords(inputStr);
	}
}