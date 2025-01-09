/*Create a program to convert the distance of 10.8 kilometers to miles.
Hint: 1 km = 1.6 miles
I/P => NONE
O/P => The distance  ___ km in miles is ___
 */ 
 public class DistancetoMiles{
       public static void main(String []args){
		     //Assigning to store distance
             double distanceInKM=10.8; 
             // 1 KM =1.6 miles  
			 //Calculate distance in miles
             double distanceInMiles= distanceInKM * 1.6; 
			 //output
             System.out.println("The distance "+ distanceInKM +" km in miles is "+distanceInMiles);
       }
 }