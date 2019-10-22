/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2part3;

import java.util.Scanner;
import java.io.*;
import java.lang.*;
/**
 *
 * @author rj2-ingham
 */
public class ElectricityBillFromFile {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("bill_input.txt");
        Scanner input = new Scanner(file);
        
        int prevReading = input.nextInt();
        int presReading = input.nextInt();
        int day = input.nextInt();
        int month = input.nextInt();
        
        System.out.println(prevReading + " " + presReading + " " + day + " " + month);
        
        if (prevReading < 10000 && prevReading > 0 && presReading < 10000 && presReading > 0) {
            if (presReading > prevReading) {
                if (presReading - prevReading <= 1000) {
                    if (month > 0 && month < 13) {
                        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                            if (day == 31) {
                                System.out.println("No errors found");
                            }                        
                        }
                        else if (month == 2) {
                            if (day == 28) {
                                System.out.println("No errors found");
                            }
                            else System.out.println("Error: incorrect days in month");
                        }
                        else {
                            if (day == 30) {
                                System.out.println("No errors found");
                            }
                            else System.out.println("Error: incorrect days in month");
                        }
                    }
                    else System.out.println("Error: month out of range");
                }
                else System.out.println("Error: Electricity used over 1000");
            }
            else System.out.println("Error: previous reading is greater than present reading");
        }
        else System.out.println("Error: One or more readings are out of range");
        
    }
    
}
