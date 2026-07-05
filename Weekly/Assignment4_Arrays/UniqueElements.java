// Problem Statement:
// Print only the unique elements from an array.
// Do not use another array or any collection.

public class UniqueElements {

    public static void main(String[] args) {

        int arr[] = {5, 3, 8, 5, 2, 3, 9, 8};

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            // Check if element already appeared
            for (int j = 0; j < i; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.println(arr[i]);
            }
        }
    }
}