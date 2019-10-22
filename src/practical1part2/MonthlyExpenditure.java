/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical1part2;

/**
 *
 * @author rj2-ingham
 */

/* The objective of this programme is for calculating the Total Money we spent last month. The program uses three
variables as input for Food, Leisure and Clothes expenses, and it uses another variable as
output for the total money spent as output */
import java.util.Scanner;

public class MonthlyExpenditure {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input food expenses: ");
        double foodExpenses = input.nextDouble();
        System.out.println("Input leisure expenses: ");
        double leisureExpenses = input.nextDouble();
        System.out.println("Input clothes expenses: ");
        double clothesExpenses = input.nextDouble();
        final double ACCOMMODATION = 50;
        System.out.println("Input travel expenses: ");
        double travel = input.nextDouble();
        double totalSpent;
        totalSpent = foodExpenses + leisureExpenses + clothesExpenses + ACCOMMODATION + travel;
        System.out.println("The total expenditure this month was £" + totalSpent);
    }

}
