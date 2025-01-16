import java.util.Scanner;

public class RemoveDuplicates{
	 // Method to remove Duplicates
    public static String removeDuplicates(String text){
		boolean[] seen=new boolean[256];
		StringBuilder result =new StringBuilder();
		for(int i=0;i<text.length();i++){
			char ch=text.charAt(i);
			if(!seen[ch]){
				result.append(ch);
				seen[ch]=true;
			}
		}
		
		return result.toString();
	}

   public static void main(String [] args){
		// Create a Scanner object to take input from the user
		Scanner input = new Scanner(System.in);

		
		
		//take input from the user
		System.out.print("Enter a string: ");
        String text = input.nextLine();
		
		// remove extra space
		text=text.trim();
		
		// Call the method t roemove Duplicates
        String result=removeDuplicates(text);
			System.out.println("Before removing: " +text+ " :After removing duplicates  :"  +result);
		
		input.close();


	}
}