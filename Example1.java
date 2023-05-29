import java.util.Scanner;

/*
Problem: You need to write a program that finds the largest number in an array.
The array elements will be taken from the user, and the user can continue adding
elements to the array until they enter -1. Once the user enters -1, the program will display the largest number in the array.
 */
public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE;
        int number;

        System.out.println("Enter array elements (enter -1 to exit):");

        while (true) {
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("Largest number: " + max);
    }
}
