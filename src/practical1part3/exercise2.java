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
public class exercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double fahrenheit;
        
        System.out.println("Input celsius value: ");
        double celsius = input.nextDouble();
        
        fahrenheit = (9.0/5)*celsius+32;
        System.out.println(celsius + "degrees celsius is " + fahrenheit + "degrees fahrenheit");
        
        
    }

}
