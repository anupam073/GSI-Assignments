/*
Question:
Write a Java program to count the number of digits in the number 987654 using a loop.

Expected Output:
Number of digits = 6
*/

public class CountDigits {

    public static void main(String[] args) {

        int num = 987654;
        int count = 0;

        while (num != 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}