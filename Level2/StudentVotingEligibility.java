/* Write a program to take user input for the age of all 10 students in a class and check whether the student can vote depending on his/her age is greater or equal to 18.
Hint => 
Create a class public class StudentVoteChecker and define a method public boolean canStudentVote(int age) which takes in age as a parameter and returns true or false
Inside the method firstly validate the age for a negative number, if a negative return is false cannot vote. 
For valid age check for age is 18 or above return true; else return false;
In the main function define an array of 10 integer elements, loop through the array by take user input for the student's age, 
call canStudentVote() and display the result
*/

// importing scanner class
import java.util.Scanner;
public class StudentVotingEligibility{
   public static boolean canStudentVote(int age){
        if(age<0) {
				return false;
			}
			else if(age>=18){
				return true;
			}
			else{
				return false;
			}
   }
   public static void main(String args[]){
	   //Defining Scanner class
		Scanner sc=new Scanner(System.in); 
		
		//creating an array of size 10 to store age of students
		int studentAge[]=new int[10]; 
		
		System.out.print("Enter 10 Student ages: "); 
		
		//Taking age input from student 
		for(int i=0;i<studentAge.length;i++){
			studentAge[i]=sc.nextInt(); 
		} 
		for(int i=0;i<studentAge.length;i++){
			boolean checkValidAge = StudentVotingEligibility.canStudentVote(studentAge[i]);
			if(checkValidAge){
				System.out.println("Student "+ (i+1) +" with the age " + studentAge[i] + " can vote");
			}
			else if(studentAge[i]<0 && checkValidAge==false){
				System.err.println("Invalid Age given of student "+ (i+1));
			}else{
				System.out.println("Student "+ (i+1) +" with the age " + studentAge[i] + " can not vote");
			}
		}
		
   }

}