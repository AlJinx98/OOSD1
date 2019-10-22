package practical1part3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rj2-ingham
 */
public class exercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long population = 312032486;
        int birthRate = 7;
        int deathRate = 13;
        int immiRate = 45;
        int secondsInYear = 365 * 24 * 60 * 60;

        int birthsInYear = secondsInYear / birthRate;
        int deathsInYear = secondsInYear / deathRate;
        int immiInYear = secondsInYear / immiRate;

        for (int i = 1; i < 6; i++) {
            population += birthsInYear + immiInYear - deathsInYear;
            System.out.println("Total population in year " + i + " = " + population);
        }

    }

}
