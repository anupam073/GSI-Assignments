/*
Question:
Create a Java program that:
1. Stores 10.75 in a double variable.
2. Explicitly typecasts it to an int variable.
3. Prints both values.
*/

public class TypeCastingExample {

    public static void main(String[] args) {

        double num = 10.75;
        int intNum = (int) num; // Explicit typecasting

        System.out.println("Double value = " + num);
        System.out.println("Integer value = " + intNum);
    }
}