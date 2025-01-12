/*Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by 
generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint => 
Write a method to Generate a 6-digit OTP number using Math.random() 
Create an array to save the OTP numbers generated 10 times
Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
*/
public class OTPGenerater {
    public static int otpGenerater() {
        int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
    }

    // Check uniqueness
    public static boolean isUniqueOTP(int otp, int otpArray[], int idx) {
        for (int i = idx; i < otpArray.length; i++) {
            if (otpArray[i] == otp) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Declaring an array of size 10 to store unique OTPs
        int otpArray[] = new int[10];

        // Storing OTPs
        for (int i = 0; i < 10; i++) {
            otpArray[i] = otpGenerater();
        }

        // Print generated OTPs
        for (int i = 0; i < 10; i++) {
            System.out.println(otpArray[i]);
        }

        boolean check = false;
        for (int i = 0; i < 10; i++) {
            if (!isUniqueOTP(otpArray[i], otpArray, i + 1)) {
                check = true;
            }
        }

        if (check) {
            System.out.println("These OTPs are not unique.");
        } else {
            System.out.println("These OTPs are unique.");
        }
    }
}
