/*The University is charging the student a fee of INR 125000 for the course. 
The University is willing to offer a discount of 10%. Write a program to find
 the discounted amount and discounted price the student will pay for the course.
Hint => 
Create a variable named fee and assign 125000 to it.
Create another variable discountPercent and assign 10 to it.
Compute discount and assign it to the discount variable.
Compute and print the fee you have to pay by subtracting the discount from the fee.
O/P => The discount amount is INR ___ and final discounted fee is INR ___ */ 
public class FeesCalculater{
  public static void main(String []args){ 
     //assign fee var to store
     double fee=125000; 
	 //assign total discount
	 int discountPercent=10; 
	 //calculate discount percentage
	 double discount=(double)fee*0.1;  
	 //Calculating remaining fees
	 double remainingFees= fee-discount;  
	 //output
	 System.out.println("The discount amount is INR "+ discount+" and final discounted fee is INR "+remainingFees);
	 
	 
  }
}