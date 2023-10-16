/*
Name: Christian Nyl M. Pulmano
year and course: BSCS 1 - 2

Algorthm:
The bill for a water service subscriber is prepared as follows:
        1. Read the name of the water consumer
        2. Read the previous water meter reading in cubic meters (reading last month) from the consumer’s meter. The meter reading
        cannot be less than zero.
        3. Read the present water meter reading in cubic meters (reading this month) from the consumer’s meter. The present
        water meter reading cannot be less than the previous water meter reading.
        4. Compute the volume of water consumed (consumption = CMUSed) by subtracting the previous reading from the present reading.
        5. Read the classification of the consumer (c for commercial or r for residential)
        6. Compute the amount due from the consumer. The amount due is computed based on the following
        For residential consumers
        If Cubic Meters Consumed is then Amount Due (pesos)
        ========================================================================
        Less than or equal to 12 180.00
        More than 12 180.00 + (cubicMetersConsumed – 12) * 30.00
        For commercial consumers
        If Cubic Meters Consumed is then Amount Due (pesos)
        ========================================================================
        Less than or equal to 30 600.00
        More than 30 600.00 + (cubicMetersConsumed – 30) * 50.00
        7. Print a bill statement. The bill statement should show the name of the subscriber, the readings, the consumption and the amount due.
*/

package Exercises.midterms;

import java.util.Scanner;

public class WaterBill {
    public static void main(String[] args) {
        //create for present Reading & previous reading
        int presentReading = 0, previousReading = 0;

        //create scanner
        Scanner kbd = new Scanner(System.in);

        //create variables
        String consumer = ""; // to hold name of consumer
        char cType = 'x'; // to hold type of consumer
        int nCMUsed; // to hold number of cubic meters of water used
        int minCMResidential = 12; // to hold cut-off for minimum Bill for residential consumers
        double minBillResidential = 180.00; // minimum bill for <= 12 CubicMeters used
        float rateResidential = 30.00F; // cost of 1 Cubic Meter above the min. consumption
        int minCMCommercial = 30; // to hold cut-off for minimum Bill for commercial consumers
        double minBillCommercial = 600.00; // minimum bill for <= 20 Cubic Meters used
        float rateCommercial = 50.00F; // cost of 1 Cubic Meter above the min. consumption for commercial consumers
        double amountDue = 0.0; // to hold the amount due

        //store to the consumer
        System.out.print("Enter the consumer's name: ");
        consumer = kbd.nextLine();

        //do while looping
        do {
            System.out.print("Enter the meter reading last month: ");
            previousReading = Integer.parseInt(kbd.nextLine());
            if (previousReading < 0) {
                System.out.println("The meter reading cannot be negative.");
            }
        }
        while (previousReading < 0);

        // insert statements below...

        //get the present water meter
        do {
            System.out.print("Enter the meter reading this month: ");
            presentReading = Integer.parseInt(kbd.nextLine());
            if (presentReading < previousReading) {
                System.out.println("The meter reading cannot be negative.");

            }

        }
        while (presentReading < previousReading);

        //4. Compute the volume of water consumed (consumption = CMUSed) by subtracting the previous reading from the present reading.
        nCMUsed = presentReading - previousReading;


        // Read the classification of the consumer (c for commercial or r for residential)
        System.out.println("What is your residential classification(c for commercial & r for residential): ");
        cType = kbd.next().charAt(0);


        // Compute the amount due from the consumer. The amount due is computed based on the following
        //if user is residential
            if (cType == 'r' || cType == 'R') {

                //if meter is <= 12
                if (nCMUsed <= minCMResidential) {
                    amountDue = minBillResidential;

                    //if meter is > 12
                } else if (nCMUsed > minCMResidential) {
                    //180 + (cubic_meters - 12) * 30
                    amountDue = minBillResidential + (nCMUsed - minCMResidential) * rateResidential;

                }
            }
            // if the user is commercial
            else if (cType == 'c' || cType == 'C') {


                //check if meter is less than 30
                if (cType <= minCMCommercial) {
                    amountDue = minBillResidential;

                    //check if meter is greater than 30
                } else if (cType > minCMCommercial) {
                    amountDue = minBillCommercial + (nCMUsed - minCMCommercial) * rateCommercial;
                }
            }

            //print out the reciept
            System.out.println("======================================");
            System.out.println("Name: " + consumer);
            System.out.println("Type of consumer: " + cType);
            System.out.println("Readings: ");
            System.out.println("previous meter: " + previousReading);
            System.out.println("present meter: " + presentReading);
            System.out.println("Total Consumed: " + nCMUsed);
            System.out.println("=====================================");
            System.out.println("amount due: " + amountDue);
        }
    }

