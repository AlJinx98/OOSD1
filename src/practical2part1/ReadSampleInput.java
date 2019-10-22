/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2part1;

import java.util.Scanner;
import java.io.*;
import java.lang.*;

/**
 *
 * @author rj2-ingham
 */
public class ReadSampleInput {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("sample_input.txt");
        Scanner input = new Scanner(file);
        
        String hello = input.next();
        String world = input.next();
        int num = input.nextInt();
        System.out.println(hello + world);
        System.out.println(num);
    }
}
