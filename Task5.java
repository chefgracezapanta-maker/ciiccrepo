// Write a Java program that accepts three numbers from the user and displays the largest number.
// If all three numbers are equal, print All numbers are equal.

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Please enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Please enter third number: ");
        int num3 = scanner.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("All numbers are equal.");
        } else if (num1 >= num2 && num1 >= num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The largest number is: " + num2);
        } else {
            System.out.println("The largest number is: " + num3);
        }
        scanner.close();
    }
}
