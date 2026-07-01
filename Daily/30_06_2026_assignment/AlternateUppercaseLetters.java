/*
Question:
Print every alternate uppercase letter.

Expected Output:
A C E G I ... Y
*/

public class AlternateUppercaseLetters {

    public static void main(String[] args) {

        char ch = 'A';

        while (ch <= 'Z') {
            System.out.print(ch + " ");
            ch += 2;
        }
    }
}