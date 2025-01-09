/*Create a program to calculate the profit and loss in number and percentage based
 on the cost price of INR 129 and the selling price of INR 191. 
Hint => 
Use a single print statement to display multiline text and variables.
Profit = selling price - cost price
Profit Percentage = profit / cost price * 100
I/P => NONE
O/P => 
The Cost Price is INR ___ and Selling Price is INR ___
The Profit is INR ___ and the Profit Percentage is ___
*/  

public class ProfitLossCalculater{ 
	public static void main(String []args){
		//Assign CP and SP
		int costPrice=129; 
		int sellPrice=191;
		//Calculating profit and percentage
		int profit=sellPrice - costPrice;  
		double profitPercentage= (double)(profit*100/costPrice);
		
		//output
		System.out.println("The cost is INR "+ costPrice +" and Selling Price is INR "+ sellPrice+"\nThe profit is INR "+ profit+" and the Profit Percentage is "+ profitPercentage);

	  
      
	}
	
}