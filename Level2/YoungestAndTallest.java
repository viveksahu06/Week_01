/*Create a program to find the youngest friends among 3 Amar, Akbar and Anthony based on their ages and tallest among the friends based on their heights and display it
Hint => 
Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
Write a Method to find the youngest of the 3 friends
Write a Method to find the tallest of the 3 friends
*/

//importing the scanner class
import java.util.*;
//import java.util.Scanner;
public class YoungestAndTallest{

   // Method to find the youngest friend
    public static int findYoungestFriend(int[] age) {
        int youngestFriendIdx = 0;
        int youngestAge = Integer.MAX_VALUE;

        for (int i = 0; i < age.length; i++) {
            if (age[i] < youngestAge) {
                youngestAge = age[i];
                youngestFriendIdx = i;
            }
        }
        return youngestFriendIdx;
    }

    // Method to find the tallest friend
    public static int findTallestFriend(double[] height) {
        int tallestFriendIdx = 0;
        double tallestHeight = Double.MIN_VALUE;

        for (int i = 0; i < height.length; i++) {
            if (height[i] > tallestHeight) {
                tallestHeight = height[i];
                tallestFriendIdx = i;
            }
        }
        return tallestFriendIdx;
    }

    public static void main(String []args){
		// creating scanner class object for taking input
        Scanner sc = new Scanner(System.in);
		
		//Intialinzing int array for storing the age of 3 friends
		int age[]=new int[3];
		// runing a loop for storing the age of the 3 friends
		for(int i=0;i<3;i++){
			if(i==0){
				System.out.print("Enter the age of the Amar : ");
			   age[i]=sc.nextInt();
			}
			else if(i==1){
				System.out.print("Enter the age of the Akbar : ");
			   age[i]=sc.nextInt();
			}
			else if(i==2){
				System.out.print("Enter the age of the Anthony : ");
			   age[i]=sc.nextInt();
			}
			
		} 
		String name[]={"Amar", "Akbar", "Anthony"};
		
		//Intialinzing double array for storing the height of 3 firends
		double height[]=new double[3];
		// runing a loop for storing the height of the 3 firends
		for(int i=0;i<3;i++){
			   if(i==0){
				System.out.print("Enter the height of the Amar : ");
			   height[i]=sc.nextInt();
			}
			else if(i==1){
				System.out.print("Enter the height of the Akbar : ");
			   height[i]=sc.nextInt();
			}
			else if(i==2){
				System.out.print("Enter the height of the Anthony : ");
			   height[i]=sc.nextInt();
			}
			
		}
		// calling the findYoungestFriend method 
		int indexForAge =YoungestAndTallest.findYoungestFriend(age);
		
		// calling the findTallestFriend method
		int indexForHeight = YoungestAndTallest.findTallestFriend(height);
		
		//printing the result
		System.out.println("The youngest friend among three is "+name[indexForAge]+" "+"The Tallest friend among three is "+name[indexForHeight]);
		
		
		
		
		
		
	}
}