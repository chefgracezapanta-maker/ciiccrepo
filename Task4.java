// Write a program that takes a string as input and checks if it is a palindrome. 
// A palindrome is a word, number, or other sequence of characters 
// that reads the same forward and backward.

import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a word or number: ");
    String input = scanner.nextLine();
    
    String reversed = new StringBuilder(input).reverse().toString();
    if (input.equals(reversed)) {
        System.out.println("The input string is a palindrome.");
    } 
    else {
       System.out.println("The input string is not a palindrome.");
        }
        scanner.close();
    }
}
