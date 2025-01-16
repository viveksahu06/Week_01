import java.util.Scanner;

public class ReplaceWordInSentence {

    // Method to replace a word in a sentence
    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replaceAll("\\b" + target + "\\b", replacement);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the sentence
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();

        // Input the word to be replaced
        System.out.println("Enter the word to replace:");
        String targetWord = input.next();

        // Input the replacement word
        System.out.println("Enter the replacement word:");
        String replacementWord = input.next();

        // Replace the word in the sentence
        String updatedSentence = replaceWord(sentence, targetWord, replacementWord);

        // Display the result
        System.out.println("Updated Sentence:" + updatedSentence);
        

        input.close();
    }
}
