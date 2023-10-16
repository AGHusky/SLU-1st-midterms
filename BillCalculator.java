/*
name: Christian Nyl M Pulmano
Activity 1 - Midterms
Date: October 5, 2023

Algorithm:
Get the order of the user
check if the input of the user is valid
calculate how much is the tax and the tip
calculate the total
Print out the tax,tip, and the total amount
 */

package Exercises.midterms;

import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {

        Scanner kbd = new Scanner(System.in);

        System.out.println("Welcome to the Restaurant Bill Calculator!");
        System.out.println("Please choose a main course( 1 for Steak, 2 for Chicken, 3 for Vegetarian): ");

        int mainCourseChoice = kbd.nextInt();

        double mainCourseCost = 0.0;

        /* Create an if-else statement that classifies the user’s mainCourseChoice input and updates
        the value of the mainCourseCost variable depending on its price. If the user inputs a number
        other than 1, 2, or 3, a prompt must be printed in the console stating that the choice is
        invalid and exits the program.” INSERT CODE BELOW... */

        if (mainCourseChoice == 0 || mainCourseChoice > 3) {
            System.out.println("Invalid choice");
            System.exit(0);
        }

        //Main Course Cost:
        //Steak ₱399.99
        //Chicken ₱100.00
        //Vegetarian ₱85.50

        else if (mainCourseChoice == 1) {
            mainCourseCost = 399.99;
        } else if (mainCourseChoice == 2) {
            mainCourseCost = 100.00;
        } else if (mainCourseChoice == 3) {
            mainCourseCost = 85.50;
        }

        /* Initialize the values of taxRate and tipRate using the data type double. INSERT CODE
        BELOW... */

        double tax;
        double tip;

        /* Initialize the values of the taxAmount, tipAmount, and totalCost. Refer to the sample
        output given to determine the data type and formula/arithmetic operations to be used in
        computing the values. INSERT CODE BELOW... */

        tax = 0.10 * mainCourseCost;
        tip = 0.20 * mainCourseCost;
        double total_cost = tax + tip + mainCourseCost;

        /* Create print statements to display the output of the program. Refer to the sample output
        given to determine the format. INSERT CODE BELOW... */

        System.out.println("Main Course cost: " + mainCourseCost);
        System.out.println("tax(10%): " + tax);
        System.out.println("tip(20%): " + tip);
        System.out.println("------------------------");
        System.out.println("total Cost: " + total_cost);

        //end program
        kbd.close();
        System.exit(0);



    }
}
