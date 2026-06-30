/*
Question:
Write a Java program to find the largest digit in a given number.

Example:
Input: 59371
Output: 9
*/

public class LargestDigit {

    public static void main(String[] args) {

        int num = 59371;
        int largest = 0;

        while (num > 0) {

            int digit = num % 10;

            if (digit > largest) {
                largest = digit;
            }

            num = num / 10;
        }

        System.out.println("Largest Digit = " + largest);
    }
}