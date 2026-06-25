/*
Problem Statement:
Write a Java program that accepts the marks of a student (out of 100)
and displays the corresponding grade based on the following criteria.

Grading Criteria:
Marks      Grade
90 - 100   A
75 - 89    B
60 - 74    C
40 - 59    D
0 - 39     Fail
*/

import java.util.Scanner;

public class StudentGradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else if (marks >= 0) {
            System.out.println("Grade: Fail");
        } else {
            System.out.println("Invalid Marks");
        }

        sc.close();
    }
}