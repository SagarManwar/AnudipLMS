package Assigments;

import java.util.Scanner;



public class MinMaxArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int[] numbers = new int[10]; // Create an array



        // user to input 10 integers

        for (int i = 0; i < 10; i++) {

            System.out.print("Enter integer " + (i + 1) + ": ");

            numbers[i] = scanner.nextInt();

        }



        // Initialize variables 

        int min = numbers[0];

        int max = numbers[0];



        // Find the minimum and maximum 
        for (int i = 1; i < 10; i++) {

            if (numbers[i] < min) {

                min = numbers[i];

            }

            if (numbers[i] > max) {

                max = numbers[i];

            }

        }



        // Print the values

        System.out.println("Smallest value: " + min);

        System.out.println("Largest value: " + max);



        scanner.close();

    }

}

