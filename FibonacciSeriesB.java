/*
name: Christian Nyl M. Pulmano
date: October 16, 2023

algorithm:
1. The user is prompted to enter the number of terms they want in the Fibonacci series.
2. The generateFibonacciSeries method is defined to generate and print the Fibonacci series.
3. Initialize two variables a and b to 0 and 1, which represent the first two Fibonacci numbers.
4. Use if statements to handle cases where n is less than 3.
5. Use a for loop to calculate and print the remaining terms in the Fibonacci series.
6. User's input determines how many terms of the Fibonacci series are generated and displayed.
*/



package Exercises.midterms;

import java.util.Scanner;

public class FibonacciSeriesB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = input.nextInt();
        System.out.println("Fibonacci Series:");
        generateFibonacciSeries(n);
    }

    public static void generateFibonacciSeries(int n) {
        long a = 0, b = 1;
        /* Use if statements to handle cases where n is less than 3. INSERT CODE BELOW */
        do {
            if (n == 2) {
                System.out.println(a + " " + b);
                System.exit(0);
            } else if (n == 1) {
                System.out.println(a);
                System.exit(0);
            } else if (n <= 0) {
                System.out.println("Invalid input, Try again");
                System.out.println("");
                main(null);
            }
        } while (n < 3);


        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
