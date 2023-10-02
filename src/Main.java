import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user to input number of elements
        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Ask if user wants to generate values or input by himself/herself
        System.out.println("Do you want to generate values (y/n)? ");
        char choice = scanner.next().charAt(0);

        // Create an array in a chosen way
        int[] arr;
        if (choice == 'y') {
            arr = generateRandomArray(n);
        } else {
            arr = generateArrayFromUserInput(n);
        }

        // Output given array
        System.out.println("Given array:");
        printArray(arr);

        // Sort the array
        bubbleSort(arr);

        // Output sorted array
        System.out.println("Sorted array:");
        printArray(arr);

        // Ask if user wants to repeat
        System.out.println("Do you want to repeat (y/n)? ");
        choice = scanner.next().charAt(0);

        if (choice == 'y') {
            main(args);
        }
    }

    // Method to generate a random array with given length
    private static int[] generateRandomArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }

    // Method to generate an array with given length from user input
    private static int[] generateArrayFromUserInput(int n) {
        int[] arr = new int[n];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    // Method to print an array
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to sort an array using bubble sort algorithm
    private static void bubbleSort(int[] arr) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}