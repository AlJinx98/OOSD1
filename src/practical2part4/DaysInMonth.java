/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2part4;

import java.util.Scanner;

/**
 *
 * @author rj2-ingham
 */
public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input current month: ");
        int month = input.nextInt();
        System.out.print("Input current year: ");
        int year = input.nextInt();
        
        int days = 0;
        String nameOfMonth = null;
        
        switch (month) {
            case 1:
                days = 31;
                nameOfMonth = "January";
                break;
            case 2:
                days = 28;
                nameOfMonth = "February";
                break;
            case 3:
                days = 31;
                nameOfMonth = "March";
                break;
            case 4:
                days = 30;
                nameOfMonth = "April";
                break;
            case 5:
                days = 31;
                nameOfMonth = "May";
                break;
            case 6:
                days = 30;
                nameOfMonth = "June";
                break;
            case 7:
                days = 31;
                nameOfMonth = "July";
                break;
            case 8:
                days = 31;
                nameOfMonth = "August";
                break;
            case 9:
                days = 30;
                nameOfMonth = "September";
                break;
            case 10:
                days = 31;
                nameOfMonth = "October";
                break;
            case 11:
                days = 30;
                nameOfMonth = "November";
                break;
            case 12:
                days = 31;
                nameOfMonth = "December";
                break;
        }
        
        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0) {
                days = 29;
            }
            else if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                days = 29;
            }
            else if (year % 100 == 0 && year % 400 != 0) {
                days = 28;
            }
        }
        
        System.out.println(nameOfMonth + " " + year + " had " + days + " days.");
    }
}
