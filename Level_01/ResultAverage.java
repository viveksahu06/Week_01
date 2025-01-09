/*Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___ 
*/ 
public class ResultAverage{
	public static void main(String []args){
	       String name="Sam"; 
		   //assign num in maths
	       int numberInMaths = 94; 
		   //assign num in physics
	       int numberInPhysics= 95;
		   //assign num in chemistry
		   int numberInChemistry= 96; 
		   //calculating avg marks
	       float averageMarksInPCM=(float)(numberInMaths+numberInPhysics+numberInChemistry)/3; 

	       System.out.println("Sam's average mark in PCM is "+ averageMarksInPCM);

	}
}