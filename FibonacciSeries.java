/*
name: Christian Nyl M. Pulmano
date: October 16, 2023

Algorithm:
In this program, generate two methods: generateFibonacciUsingForLoop and generateFibonacciUsingWhileLoop.
Use these methods to generate the Fibonacci series up to the desired number of terms (n).
Initialize the first two Fibonacci numbers as 0 and 1 and then use loops to calculate and print the subsequent numbers in the
series. The scenario involves generating the series up to the first 15 Fisbonacci numbers.
*/


package Exercises.midterms;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 15; // Number of Fibonacci numbers to generate

        System.out.println("Using for loop:");
        generateFibonacciUsingForLoop(n);
        System.out.println("\nUsing while loop:");
        generateFibonacciUsingWhileLoop(n);
    }
    //Generate Fibonacci using a for loop
    public static void generateFibonacciUsingForLoop(int n) {
        long a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
    /* Generate Fibonacci using a while loop. INSERT CODE BELOW */

    public static void generateFibonacciUsingWhileLoop(int n) {
        long a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        int i = 2;
        while (i < n){
            long c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }


}

