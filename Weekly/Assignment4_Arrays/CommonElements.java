// Problem Statement:
// Given two arrays, print the common elements.
// Do not print duplicate common elements.

public class CommonElements {

    public static void main(String[] args) {

        int arr1[] = {2, 5, 7, 9, 11, 5};
        int arr2[] = {1, 5, 7, 15, 20, 5};

        for (int i = 0; i < arr1.length; i++) {

            boolean duplicate = false;

            // Check if already printed
            for (int k = 0; k < i; k++) {
                if (arr1[i] == arr1[k]) {
                    duplicate = true;
                    break;
                }
            }

            if (duplicate)
                continue;

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }
}