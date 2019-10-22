/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4part2;

/**
 *
 * @author rj2-ingham
 */
public class ProcessStrings {
    
    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = "Welcome to Java";
        String s3 = "Welcome to C++";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        
        String city1 = "New York";
        String city2 = "Boston";
        
        if (city1.compareTo(city2) < 0)
            System.out.println("The cities in alphabet order are " + city2 + " " + city1);
        else 
            System.out.println("The cities in alphabetical order are " + city2 + " " + city1);  
    }
    
}
