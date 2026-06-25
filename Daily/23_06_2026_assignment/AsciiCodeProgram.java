/*
Assignment 1: ASCII Code Program

Question:
Write a Java program to print the ASCII value of the following characters:
• A
• a
• 0
• @

Expected Output:
ASCII value of A = 65
ASCII value of a = 97
ASCII value of 0 = 48
ASCII value of @ = 64
*/

public class AsciiCodeProgram {

    public static void main(String[] args) {

        char ch1 = 'A';
        char ch2 = 'a';
        char ch3 = '0';
        char ch4 = '@';

        System.out.println("ASCII value of " + ch1 + " = " + (int) ch1);
        System.out.println("ASCII value of " + ch2 + " = " + (int) ch2);
        System.out.println("ASCII value of " + ch3 + " = " + (int) ch3);
        System.out.println("ASCII value of " + ch4 + " = " + (int) ch4);
    }
}