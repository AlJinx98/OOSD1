/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2part2;

import java.util.Scanner;
import java.io.*;
import java.lang.*;
/**
 *
 * @author rj2-ingham
 */
public class ElectricityBillFurther {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        int presReading = 0;
        int prevReading = 0;
        int day = 0;
        int month = 0;
        
        boolean prevValid = false;
        boolean presValid = false;
        boolean dayValid = false;
        boolean monthValid = false;
        
        while (prevValid == false) {
            System.out.print("Input previous reading: ");
            prevReading = input.nextInt();
            
            // call checkReadingValid method ...
            prevValid = checkReadingValid(prevReading);         
        }
        
        while (presValid == false) {
           System.out.print("Input current reading: ");
           presReading = input.nextInt(); 
           
           // call checkReadingValid method ...
           presValid = checkReadingValid(presReading);
           
           // check if current reading is greater than previous ...
           if (prevReading > presReading) {
               System.out.println("Error: Previous reading must not be higher than present reading");
               presValid = false;
           }
           else 
               presValid = true;
           
           // check if electricity usage is less than 1000 ...
           if (presReading - prevReading > 1000) {
               System.out.println("Error: Difference between present and previous readings must not be greater than 1000");
               presValid = false;
           }
           else
               presValid = true;
        }

        
        while (monthValid == false) {
            System.out.print("Input current month: ");
            month = input.nextInt();
            
            if (month > 1 && month < 12) 
                monthValid = true;
            else
                System.out.println("Error: month value must be between 1 and 12");
        }
        
        while (dayValid == false) {
            System.out.print("Input current day: ");
            day = input.nextInt();
            
           
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                if (day == 31)
                    dayValid = true;
                else
                    System.out.println("Error: day value should correspond with the month, e.g. Month 1 (January) should have day value of 31");
           
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                if (day == 30)
                    dayValid = true;
                else
                    System.out.println("Error: day value should correspond with the month, e.g. Month 1 (January) should have day value of 31");
            }
            else if (month == 2) {
                if (day == 28)
                    dayValid = true;
                else
                    System.out.println("Error: day value should correspond with the month, e.g. Month 1 (January) should have day value of 31");
            }
            else {
                System.out.println("Error: day value should correspond with the month, e.g. Month 1 (January) should have day value of 31");
            }    
        }
        
        System.out.println("Previous reading: " + prevReading);
        System.out.println("Current reading: " + presReading); 
       System.out.println("Current day: " + day);
        System.out.println("Current month: " + month);
    }
    
    public static boolean checkReadingValid(int reading) {
        /// reusable method to check if the readings are valid
        if (reading < 0 || reading > 9999) {
            System.out.println("Reading must be between 0 and 9999");
            return false;
        }
        else
            return true;
    }  
}

