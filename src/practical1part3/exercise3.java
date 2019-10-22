/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1part3;

import java.util.Scanner;

/**
 *
 * @author rj2-ingham
 */
public class exercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double interest = 0.00417;

        System.out.println("Input monthly savings");
        double savings = input.nextDouble();
        double monthlySavings = savings;

        for (int i = 0; i < 6; i++) {   
            savings = monthlySavings + savings*(1 + interest);
        }
        
        System.out.println("Savings after 6 months are : " + savings);

    }

}
