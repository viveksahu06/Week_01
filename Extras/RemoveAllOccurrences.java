import java.util.Scanner;

public class RemoveAllOccurrences {

    // Method to Remove All Occurrences
    public static String removeAll(String str,char characterToRemove) {

       StringBuilder result=new StringBuilder();

       
        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i)!=characterToRemove){
			   char ch=str.charAt(i);
			   result.append(ch);
		   }else{
			   continue;
		   }
        }


        return result.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a String:");
        String str = input.nextLine();
		
		System.out.println("Enter a Character to Remove:");
       char characterToRemove = input.next().charAt(0);


        // call a method to Remove All Occurrences
        String result = removeAll(str,characterToRemove);

        // Display the result
        
            System.out.println("after Removeing All Occurrences: '" + result + "'");
       

        input.close();
    }
}
