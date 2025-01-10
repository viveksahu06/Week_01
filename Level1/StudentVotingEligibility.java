/*
Write a program to take user input for the age of all 10 students in a class and
 check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Define an array of 10 integer elements and take user input for the student's age. 
Loop through the array using the length property and for the element of the 
array check If the age is a negative number print an invalid age and if 18 or 
above, print The student with the age ___ can vote. Otherwise, print The student 
with the age ___ cannot vote. 
*/
import java.util.*; 

public class StudentVotingEligibility{
	public static void main(String []args){
		//Defining Scanner class
		Scanner sc=new Scanner(System.in); 
		
		//creating an array of size 10 to store age of students
		int studentAge[]=new int[10]; 
		
		System.out.print("Enter 10 Student ages: "); 
		
		//Taking age input from student 
		for(int i=0;i<studentAge.length;i++){
			studentAge[i]=sc.nextInt(); 
		} 
		
		//Displaying the result 
		for(int i=0;i<studentAge.length;i++){
			if(studentAge[i]<0) {
				System.err.println("Invalid Age given of student "+ (i+1));
			}
			else if(studentAge[i]>=18){
				System.out.println("Student "+ (i+1) +" with the age " + studentAge[i] + " can vote");
			}
			else{
				System.out.println("Student "+ (i+1) +" with the age " + studentAge[i] + " can not vote");
			}
		}
		
		
		
	
	}
	
	
}