/*
Question:
Write a Java program to find the sum of digits of the number 4567.

Expected Output:
Sum of digits = 22
*/

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 4567;
        int sum = 0;

        while (num != 0) {

            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}