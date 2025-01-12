/*Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 
150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team 
Write the method to find the tallest height of the players on the football team
Finally display the results
*/
import java.util.*;
public class PlayersHeightDetails{
	//method to find random heights
	public static int randomHeights(){
		// to find random height between 150 and 250
		int randomHeight = (int) (Math.random() * 101) + 150; 
		
		return randomHeight;
	}
	
	//method to find sum of heights 
	public  static int sumOfHeights(int heights[]){
		int sum=0; 
		int size = heights.length; 
		
		//calculating sum 
		for(int i=0;i<size;i++){
			sum+=heights[i];
		} 
		
		return sum;
	}
	
	//method for finding mean heights of player 
	public static double meanHeight(int heights[]){
		
		int sumOfHeight= sumOfHeights(heights); 
		
		int totalLength=heights.length; 
		
		double meanOfHeight=(double)(sumOfHeight*1.0/totalLength); 
		
		return meanOfHeight;
		
	} 
	
	//method to find the shortest height of the players 
	public static int shortestHeightPlayer(int heights[]){
		int shortHeight=heights[0]; 
		int shortIdx=0;
		for(int i=0;i<heights.length;i++){
			if(heights[i]<shortHeight){
				shortHeight=heights[i]; 
				shortIdx=i;
			}
		} 
		
		return shortIdx;
	} 
	
	//method to find the tallest height of the players
	public static int tallestHeightPlayer(int heights[]){
		int tallHeight=heights[0]; 
		int tallIdx=0;
		for(int i=0;i<heights.length;i++){
			if(heights[i]>tallHeight){
				tallHeight=heights[i]; 
				tallIdx=i;
			}
		} 
		
		return tallIdx;
	} 
	
	public static void main(String []args){
		
		int playerHeights[] = new int [11];  
		
		//assigning random height of players in height array 
		
		for(int i=0;i<playerHeights.length;i++){
			playerHeights[i] =randomHeights();
		} 
		
		// Displaying the height of players
		System.out.print("Height of the 11 players is " );
		for(int i=0;i<playerHeights.length;i++){
			System.out.print(playerHeights[i]+" ");
		}
		//for new line
		System.out.println();  
		
		//Displaying the sum of height 
		System.out.println("Total sum of 11 players heights is " +sumOfHeights(playerHeights)); 
		
		//Displaying the mean height
		System.out.println("The mean height of 11 players is " +meanHeight(playerHeights));
		
		//Displaying the shortest height player 
		int shortHeightIdx = shortestHeightPlayer(playerHeights); 
		
		System.out.println("Player number " +(shortHeightIdx+1) +" is having shortest height and height is " + playerHeights[shortHeightIdx]+ " cms");
		
		//Displaying the tallest height player 
		int tallHeightIdx = tallestHeightPlayer(playerHeights); 
		
		System.out.println("Player number " +(tallHeightIdx+1) +" is having tallest height and height is " + playerHeights[tallHeightIdx]+ " cms");
		
		
		
	}
}

