import java.util.Scanner;
public class ToggleCase{
    // Method to toggle case of each character in the string

	public static String toggle(String str){
		StringBuilder result=new StringBuilder();

		for(int i=0;i<str.length();i++){
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)){
				result.append(Character.toLowerCase(ch));
			}else if(Character.isLowerCase(ch)){
				result.append(Character.toUpperCase(ch));
			}else{
				result.append(ch);
			}
		}
		
		
		// Return the result

		return result.toString();
	}
	public static void main(String [] args){
		// Input a string from the user

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str=input.next();
		
		
		str=str.trim();
		
		// Find and display the result
        String toggledString = toggle(str);
        System.out.println("Toggled Case String: " + toggledString);
        input.close();

		
	}
	
}