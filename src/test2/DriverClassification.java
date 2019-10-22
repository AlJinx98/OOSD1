package test2;

import java.util.Scanner;

/**
 *
 * @author rj2-ingham
 */
public class DriverClassification {

    public static void main(String[] args) {
        /*
        PROGRAMME HEADER : 
            A programme that will take the license number and number of penalties
            on the license from the user.
            It then queries the user using while loops until the inputs are
            valid, if they are not initially valid.
            Then calculates from given ranges whether the user is a careless,
            reckless, or dangerous driver. This is the type of driver.
            Outputs the users license number and what type of driver they are.
         */

        // Create new scanner instance "input"
        Scanner input = new Scanner(System.in);

        /* initialise variables. licenseNumber, numOfPenalties and typeOfDriver
           need a placeholder value otherwise an uninitialised error is thrown.
         */
        int licenseNumber = 0;
        int numOfPenalties = 0;
        String typeOfDriver = "";
        /* initialise while loop flags. This means that instead of throwing
           an error if an input value is invalid at the end of the programme,
           the programme throws an error while the user is still inputting values
           so that the user can rectify the error.
         */
        boolean licenseValid = false;
        boolean penaltiesValid = false;

        // get one line of input from the user.
        System.out.println("Input driving license number and penalties : ");
        licenseNumber = input.nextInt();
        numOfPenalties = input.nextInt();
        
        // while loop to query user until the license number is in range
        while (licenseValid == false) {

            // input value must be between 0 and 9999 to be valid
            if (licenseNumber > 0 && licenseNumber <= 9999) {
                licenseValid = true;
            } else {
                // print comprehensive error message for the user
                System.out.println("ERROR: License must be between 1 and 9999");
                System.out.println("Input license number : ");
                licenseNumber = input.nextInt();
            }
        }

        // while loop to query user until the number of penalties is valid
        while (penaltiesValid == false) {
            // initial validity test between 1 and 14
            if (numOfPenalties > 0 && numOfPenalties <= 14) {
                penaltiesValid = true;
                // if valid, continue to assign the type of driver from given ranges
                if (numOfPenalties >= 1 && numOfPenalties <= 3) {
                    typeOfDriver = "careless";
                } else if (numOfPenalties >= 4 && numOfPenalties <= 7) {
                    typeOfDriver = "reckless";
                } else {
                    typeOfDriver = "dangerous";
                }

            } // if initial input not valid, query user again with error message
            else {
                System.out.println("ERROR: Number of penalties must be between 1 and 14");
                System.out.println("Input number of penalties : ");
                numOfPenalties = input.nextInt();
            }

        }
        // final output of license number and type of driver.
        System.out.println(licenseNumber + " " + typeOfDriver);

    }
}
