/*Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
Hint => 
Use Modulus Operator (%) to find the reminder.
Use Division Operator to find the Quantity of pens
I/P => NONE
O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___*/
public class PenDestributer{ 
  public static void main(String []args){
	  
	   //assign num of pen and student
	   int numberOfPens=14; 
	   int numberOfStudent=3; 
	   //calculate no of pens per student
	   int perStudentPen= numberOfPens/numberOfStudent; 
	   //calculate remaining pens
	   int remainingPens= numberOfPens% numberOfStudent; 
	   //output
	   System.out.println("The Pen per Student is "+ perStudentPen +" and the remaining pen not distributed is " + remainingPens);

  }
}