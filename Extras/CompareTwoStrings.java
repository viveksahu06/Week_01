import java.util.Scanner;
public class CompareTwoStrings{
    // Method to toggle case of each character Compare Two Stringsin the string

	public static void compare(String str1,String str2){
		int sizeofstr1=str1.length();
		int sizeofstr2=str2.length();
		int minLength=Math.min(sizeofstr1,sizeofstr2);
		StringBuilder result=new StringBuilder();

		for(int i=0;i<minLength;i++){
			  char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

        // If characters are different, compare their ASCII values
        if (ch1 < ch2) {
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
                return;
            } else if (ch1 > ch2) {
                System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
                return;
            }
        }

        // If characters are the same, compare lengths
        if (sizeofstr1< sizeofstr2) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else if (sizeofstr1 > sizeofstr2) {
            System.out.println("\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order");
        } else {
            System.out.println("Both strings are lexicographically equal.");
        }
		}
	public static void main(String [] args){
		// Input a string from the user

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a String one");
		String str1=input.next();
		
		System.out.println("Enter a String two");
		String str2=input.next();
		
		str1=str1.trim();
		str2=str2.trim();
		
		// Find and display the result
          compare(str1,str2);
        
        input.close();

		
	}
	
}