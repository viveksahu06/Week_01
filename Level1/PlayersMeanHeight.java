/*Create a program to find the mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements / number of elements
Create a double array named heights of size 11 and get input values from the user.
Find the sum of all the elements present in the array.
Divide the sum by 11 to find the mean height and print the mean height of the football team
*/
import java.util.Scanner; 
public class PlayersMeanHeight{
	public static void main(String[]args){
		//Creating scnammerr class 
		Scanner sc=new Scanner(System.in); 
		
		//Creating double array to store height of players 
		double playerHeight[] = new double[11]; 
		
		//Taking Height input from players 
		System.out.println("All players please enter your height "); 
		
		for(int i=0;i<11;i++){
			playerHeight[i]=sc.nextDouble(); 
		} 
		//performing sum of the heights
		double totalSumHeight=0.0; 
		
		for(int i=0;i<11;i++){
			totalSumHeight+=playerHeight[i];
		}
		
		//Calculate Result 
		double meanHeight= totalSumHeight/11.0;
		
		//Result
		System.out.println("Mean Height of the 11 players is : "+ meanHeight);
	}
	
}