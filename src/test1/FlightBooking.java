/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;
// IMPORT Scanner utility
import java.util.Scanner;
/**
 *
 * @author rj2-ingham
 */
public class FlightBooking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        test 1. Create a programme that calculates the total cost of a flight
        from the amount of adults and children, as well as adding on the airport
        tax.
        */
        
        // Create new Scanner instance input
        Scanner input = new Scanner(System.in);
        
        // Declare initial variables
        int adults;
        int children;
        double fareAdult;
        double fareChildren;
        double costBeforeTax;
        double totalCost;
        final double AIRPORT_TAX = 0.13;
        
        // Get user inputs
        System.out.print("Input amount of adults: ");
        adults = input.nextInt();
        System.out.print("Input amount of children: ");
        children = input.nextInt();
        System.out.print("Input fare for an adult: ");
        fareAdult = input.nextDouble();
        System.out.print("Input fare for a child: ");
        fareChildren = input.nextDouble();
        
        // Calculate total cost before airport tax by adding up individual ticket prices
        costBeforeTax = (adults * fareAdult) + (children * fareChildren);
        // Calculate total cost after tax
        totalCost = costBeforeTax * (1 + AIRPORT_TAX);
        
        // Use printf to format the output so that the totalCost is output to 2 decimal places.
        System.out.printf("Your total cost of the booking is £%.2f. %n", totalCost);
        
    }
    
}
