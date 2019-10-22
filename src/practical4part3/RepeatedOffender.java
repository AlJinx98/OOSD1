/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical4part3;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author rj2-ingham
 */
public class RepeatedOffender {

    public static void main(String[] args) throws Exception {
        File file = new File("dna_input.txt");
        Scanner input = new Scanner(file);

        boolean isRepeatOffender = false;

        int referenceOffender = input.nextInt();
        double dna11 = input.nextDouble();
        double dna12 = input.nextDouble();
        double dna13 = input.nextDouble();
        int numOfSamples = input.nextInt();
        int reference = 0;

        while (isRepeatOffender == false && input.hasNextLine() == true) {
            reference = input.nextInt();
            double dna21 = input.nextDouble();
            double dna22 = input.nextDouble();
            double dna23 = input.nextDouble();

            isRepeatOffender = matchingProfiles(dna11, dna12, dna13, dna21, dna22, dna23);
        }

        if (isRepeatOffender == true) {
            System.out.println("Matching sample found for Reference " + referenceOffender + " : " + reference);
        }
        else
            System.out.println("Not a repeat offender");

    }

    public static boolean matchingProfiles(double dna11, double dna12, double dna13, double dna21, double dna22, double dna23) {
        if (dna11 == dna21 && dna12 == dna22 && dna13 == dna23) {
            return true;
        } else {
            return false;
        }
    }

}
