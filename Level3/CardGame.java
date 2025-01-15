/*Write a program to create a deck of cards, initialize the deck, shuffle the deck, and distribute the deck of n cards to x number of players. Finally, print the cards the players have.
Hint => 
Create a deck of cards with suits "Hearts", "Diamonds", "Clubs", "Spades" and ranks
 from "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", and 
 "Ace"
Calculate the number of cards in the deck and initialize the deck
int numOfCards = suits.length * ranks.length;
Write a Method to Initialize the deck of cards with suits and ranks and return the
 deck. The deck is an array of strings where each string represents a card in the 
 deck represented as "rank of suit" e.g., "2 of Hearts"
Write a Method to Shuffle the deck of cards and return the shuffled deck. To 
shuffle the card iterate over the deck and swap each card with a random card from
 the remaining deck to shuffle the deck. Please find the steps below
Step1: Use for Loop Iterate over the deck and swap each card with a random card 
from the remaining deck
Step 2: Inside the Loop Generate a random card number between i and n using the 
following code 
int randomCardNumber = i + (int) (Math.random() * (n - i));
Step 3: Swap the current card with the random card
Write a Method to distribute the deck of n cards to x number of players and return
 the players. For this Check the n cards can be distributed to x players. If 
 possible then Create a 2D array to store the players and their cards
Write a Method to Print the players and their cards
*/
import java.util.*;

public class CardGame {

    // Method to initialize the deck of cards with suits and ranks
    public static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        // Total number of cards in the deck
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        // Fill the deck with cards (rank of suit)
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            // Generate a random index to swap the current card with
            int randomCardNumber = i + random.nextInt(deck.length - i);
            // Swap the cards
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // Method to distribute the deck of n cards to x players
    public static String[][] distributeDeck(String[] deck, int numOfCards, int numOfPlayers) {
        // If n cards can be equally distributed to x players
        if (numOfCards % numOfPlayers != 0) {
            System.out.println("The deck cannot be equally distributed to the players.");
            return null;
        }

        // Create a 2D array to store each player's cards
        String[][] players = new String[numOfPlayers][numOfCards / numOfPlayers];
        int cardIndex = 0;

        // Distribute cards to players
        for (int i = 0; i < numOfPlayers; i++) {
            for (int j = 0; j < numOfCards / numOfPlayers; j++) {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print the players and their cards
    public static void printPlayersCards(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println(); // Empty line between players
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the deck of cards
        String[] deck = initializeDeck();
        
        // Shuffle the deck
        deck = shuffleDeck(deck);

        // Ask the user for the number of players
        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();

        // Total number of cards in the deck
        int numOfCards = deck.length;

        // Distribute the deck of cards to players
        String[][] players = distributeDeck(deck, numOfCards, numOfPlayers);

        // Print the players and their cards
        printPlayersCards(players);

    }
}
