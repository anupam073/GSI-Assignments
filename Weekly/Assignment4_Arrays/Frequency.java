
// Problem Statement:
// Print the frequency of every unique element in the array.
// Do not print the frequency of the same element more than once.

public class Frequency {

    public static void main(String[] args) {

        int arr[] = {4, 2, 4, 6, 2, 2, 7};

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            // Check if already counted
            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate)
                continue;

            int count = 0;

            // Count frequency
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}