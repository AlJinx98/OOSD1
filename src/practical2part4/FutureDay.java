/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2part4;

import java.util.Scanner;
import java.lang.*;
import java.io.*;
/**
 *
 * @author rj2-ingham
 */
public class FutureDay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String dayName = " ";
        
        System.out.print("Enter today's day: ");
        int today = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed = input.nextInt();
        
        switch (today) {
            case 0:
                dayName = "Sunday";
                break;
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
        }
        
        int j = today;
        for (int i = 0; i<elapsed; i++) {
            j++;
            if (j == 7) 
                j = 0;
        }
        
        String newDayName = " ";
        switch (j) {
            case 0:
                newDayName = "Sunday";
                break;
            case 1:
                newDayName = "Monday";
                break;
            case 2:
                newDayName = "Tuesday";
                break;
            case 3:
                newDayName = "Wednesday";
                break;
            case 4:
                newDayName = "Thursday";
                break;
            case 5:
                newDayName = "Friday";
                break;
            case 6:
                newDayName = "Saturday";
                break;
        }
        System.out.println("Today is " + dayName + " and the future day is : " + newDayName);
        
        
    }
    
}
