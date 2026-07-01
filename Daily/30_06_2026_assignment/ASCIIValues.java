/*
Question:
Print the ASCII values of A to Z.

Expected Output:
A = 65
B = 66
...
Z = 90
*/

public class ASCIIValues {

    public static void main(String[] args) {

        char ch = 'A';

        while (ch <= 'Z') {
            System.out.println(ch + " = " + (int) ch);
            ch++;
        }
    }
}