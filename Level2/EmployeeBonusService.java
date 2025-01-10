/*Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, 
along with the old and new salary.
Hint => 
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, 
and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. 
Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. 
Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
 */
 // importing the scanner class
 import java.util.Scanner;
 public class EmployeeBonusService{
  public static void main(String []args){
          // creating a scanner class object for user input
          Scanner sc = new Scanner(System.in);
          // Intializing the double array for taking the empolyee year of services		  
          double employeeYearOfService [] = new double[11];
		  
		  // running a loop for taking the employee year of service of each empolyee
		  for(int i=1; i<=10;i++){
			  System.out.print("Enter the Service Year of employee "+i+ " : ");
			  employeeYearOfService[i]=sc.nextDouble();
			  System.out.println();
		  }
		  // Intializing the double array for taking the empolyee old salary
		  double employeeOldSalary [] = new double[11];
		  // running a loop for taking the employee old salary of each empolyee
		  for(int i=1; i<=10;i++){
			  System.out.print("Enter the old Salary of the employee "+i+ " : ");
			  employeeOldSalary[i]=sc.nextDouble();
			  System.out.println();
			  
		  }
		    // initializing the employee new salary array 
			double employeeNewSalary []= new double[11];
			// initializing the employee bonus new array
			double employeeBonous [] = new double[11];
			
			// running a loop for finding the employeebonous and employeeNewService based on there year of service
			for(int i=1;i<=10;i++){
			   if(employeeYearOfService[i]>5){
                  employeeBonous[i]=(employeeOldSalary[i]*5)/100;
				  employeeNewSalary[i]= employeeOldSalary[i]+employeeBonous[i];
			   }
			   else if(employeeYearOfService[i]<=5){
                  employeeBonous[i]=(employeeOldSalary[i]*2)/100;
				  employeeNewSalary[i]= employeeOldSalary[i]+employeeBonous[i];
			   }
			}
			// Printing the output for each employee
			for(int i=1;i<=10;i++){
			System.out.println("Employee Number : "+i+"\nTotal Bonus Payout: "+employeeBonous[i]+" Total Old Salary: "+employeeOldSalary[i]+
                                " Total New Salary: " +employeeNewSalary[i]);			
			}
  }  

}
 
 