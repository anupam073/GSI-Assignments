/*
Question:
Write a Java program to print the first 10 terms of the Fibonacci series using a loop.

Expected Output:
0 1 1 2 3 5 8 13 21 34
*/

public class FibonacciSeries {

    public static void main(String[] args) {

        int first = 0;
        int second = 1;

        System.out.print("First 10 terms of Fibonacci series: ");

        for (int i = 1; i <= 10; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}