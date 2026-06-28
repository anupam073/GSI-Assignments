/*
Question:
Write a Java program to calculate the factorial of 6 using a loop.

Expected Output:
Factorial of 6 = 720
*/

public class Factorial {

    public static void main(String[] args) {

        int num = 6;
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + num + " = " + factorial);
    }
}