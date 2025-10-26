package Mock;
// WAJP Insert two element at particular index in array, and sort updated array using insertion sort?

import java.util.*;

public class task1 {


  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking array input from the user
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Taking index and values to insert
        System.out.print("Enter index to insert elements: ");
        int index = scanner.nextInt();
        
        System.out.print("Enter first element to insert: ");
        int element1 = scanner.nextInt();
        
        System.out.print("Enter second element to insert: ");
        int element2 = scanner.nextInt();
        
        // Expanding array size
        int[] newArr = new int[n + 2];
        
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element1;
            } else if (i == index + 1) {
                newArr[i] = element2;
            } else {
                newArr[i] = arr[j++];
            }
        }
        
        // Sorting using Insertion Sort
        insertionSort(newArr);
        
        System.out.println("Sorted Array: " + Arrays.toString(newArr));
    }
    
    // Insertion Sort implementation
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}


