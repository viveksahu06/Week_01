/*Write an IntOperation program by taking a, b, and c as input 
values and print the following integer operations 
a + b *c, a * b + c, c + a / b, and a % b + c. 
Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign result to a variable
Finally print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are —-, -—, and —-*/
import java.util.Scanner;
public class IntOperation{
	public static void main(String []args){
		//Declare scanner to take iinnput from user
		Scanner sc=new Scanner(System.in);
		//taking first variable as input from user
		System.out.print("Enter first input a: ");
		int a=sc.nextInt();
		//taking second variable input 
		System.out.print("Enter second input b: ");
		int b=sc.nextInt(); 
		//taking third variable input
		System.out.print("Enter third input c: ");
		int c=sc.nextInt();
		
		//calcuating a + b *c 
		int result1= a + b *c; 
		
		//calculating a * b + c
		int result2= a * b + c; 
		
		//calculating c + a / b
		int result3= c + a / b;
		
		//calculating a % b + c
		int result4= a % b + c;
		
		//output 
		System.out.println("The results of Int Operations (a + b *c, a * b + c, c + a / b, and a % b + c) are "+result1+" "+
		     result2+" "+result3+" and "+result4);
		
		
	}
}
	