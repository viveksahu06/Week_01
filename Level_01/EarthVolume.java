/*Write a Program to compute the volume of Earth in km^3 and miles^3
Hint => Volume of a Sphere is (4/3) * pi * r^3 and radius of earth is 6378 km
O/P => The volume of earth in cubic kilometers is ____ and cubic miles is ____*/ 
public class EarthVolume{
	public static void main(String []args){ 
	    //storing radius of earth
		double radiusOfEarth = 6378; 
        //calculating volume
        double volumeOfEarthInKM = (4.0 / 3.0) * Math.PI * Math.pow(radiusOfEarth, 3); 
        //converting radius in miles
        double radiusInMiles = radiusOfEarth * 0.621371;
		//calculating volume in miles
        double volumeOfEarthInMiles = (4.0 / 3.0) * Math.PI * Math.pow(radiusInMiles, 3);
        //output
        System.out.println("The volume of Earth in cubic kilometers is " + volumeOfEarthInKM + " and in cubic miles is " + volumeOfEarthInMiles); 
	}
}