package Assigments;


import java.util.Scanner;



public class ArraySumAndAverage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        int[] numbers = new int[5]; // Create an array to store 5 integers



        for (int i = 0; i < 5; i++) {

            System.out.print("Enter integer " + (i + 1) + ": ");

            numbers[i] = scanner.nextInt();

        }

        int sum = 0;

        for (int number : numbers) {

            sum += number;

        }

        double average = (double) sum / numbers.length;

        System.out.println("Sum of the numbers: " + sum);

        System.out.println("Average of the numbers: " + average);



        scanner.close();

    }

}

