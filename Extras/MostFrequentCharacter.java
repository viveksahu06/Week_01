import java.util.Scanner;

public class MostFrequentCharacter {

    // Method to find the most frequent character 
    public static char findMostFrequentCharacter(String str) {

        int[] freq = new int[256]; 

       
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // Find the character with the highest frequency
        char mostFrequentChar = str.charAt(0);
        int maxCount = 1;

        
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxCount) {
                mostFrequentChar = (char) i;
                maxCount = freq[i];
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the string
        System.out.println("Enter a String:");
        String str = input.nextLine();

        // Find the most frequent character
        char result = findMostFrequentCharacter(str);

        // Display the result
        
            System.out.println("Most Frequent Character: '" + result + "'");
       

        input.close();
    }
}
