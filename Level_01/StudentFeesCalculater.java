/*
Write a new program similar to the program # 6 but take user input for Student Fee and University Discount
Hint => 
Create a variable named fee and take user input for fee.
Create another variable discountPercent and take user input.
Compute the discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
I/P => fee, discountPrecent
O/P => The discount amount is INR ___ and final discounted fee is INR ___
*/ 
import java.util.Scanner;
public class StudentFeesCalculater{
    public static void main(String []args){ 
	  //Create scanner to take input
	  Scanner sc=new Scanner(System.in);  
	  System.out.print("Enter Your fees : ");
	  //taking fee from user
	  int fee=sc.nextInt(); 
	  System.out.print("Enter Your discount percentage: ");
	  //input discount from user
	  double discountPercentage=sc.nextDouble(); 
	  //calculating total discount from user
	  double discount=fee*(discountPercentage/100); 
	  //remaining fees calculation
	  double remainingFeesAfterDiscount= fee-discount; 
	  //output
	  System.out.println("The discount amount is INR "+discount+" and final discounted fees is INR "+remainingFeesAfterDiscount);
	  }
}