import java.util.Scanner;

public class CheckAnagramString{

    // Method to find the most frequent character without using Map
    public static boolean isAnagram(String str1,String str2) {
		if(str1.length()!=str2.length()){
			return false;
		}

       char [] frequency=new char[256];
       
        for (int i = 0; i < str1.length(); i++) {
           frequency[str1.charAt(i)]++;
		   frequency[str2.charAt(i)]--;
        }
		for (int count :frequency) {
           if(count!=0){
			   return false;
		   }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a String one:");
        String str1 = input.nextLine();
		
		System.out.println("Enter a String two:");
        String str2 = input.nextLine();
		


        // Find the most frequent character
        boolean result = isAnagram(str1,str2);

        // Display the result
		
        if(result){
			System.out.println("string is Anagram");

		}else{
            System.out.println("String is not anagram");
		}

        input.close();
    }
}
