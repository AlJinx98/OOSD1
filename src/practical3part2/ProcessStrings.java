/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical3part2;

import java.util.Scanner;
/**
 *
 * @author rj2-ingham
 */
public class ProcessStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String message = "Welcome to Java!";
        System.out.println("The value of the string object, message, is " + message);
        System.out.println("The length of " + message + "is " + message.length());
        System.out.println("The first character of " + message + "is: " + message.charAt(0));
        System.out.println("The eigth character of " + message + "is: " + message.charAt(7));
        
        String extendedMessage = message + "Object oriented programming!";
        System.out.println(extendedMessage);
        System.out.println(extendedMessage.toLowerCase());
        System.out.println(extendedMessage.toUpperCase());
        
        System.out.print("Enter three words separated by spaces : ");
        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
        
        String s = input.nextLine();
        System.out.println("Enter a line of text : ");
        s = input.nextLine();
        System.out.println("The line entered is  " + s);
        
        System.out.println("Input a character : ");
        String sChar = input.next();
        System.out.println(sChar.charAt(0));
    }
    
}
