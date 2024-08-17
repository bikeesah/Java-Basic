

public class SelectionSort {

        // Method to perform selection sort on an array
        public static void selectionSort(int[] array) {
            int n = array.length;
    
            // One by one move the boundary of the unsorted subarray
            for (int i = 0; i < n - 1; i++) {
                // Find the minimum element in the unsorted array
                int minIndex = i;
                for (int j = i + 1; j < n; j++) {
                    if (array[j] < array[minIndex]) {
                        minIndex = j;
                    }
                }
    
                // Swap the found minimum element with the first element
                int temp = array[minIndex];
                array[minIndex] = array[i];
                array[i] = temp;
            }
        }
    
        // Method to print an array
        public static void printArray(int[] array) {
            int n = array.length;
            for (int i = 0; i < n; ++i) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    
        // Main method to test the selection sort
        public static void main(String[] args) {
            int[] array = {64, 25, 12, 22, 11};
            
            System.out.println("Unsorted array:");
            printArray(array);
    
            selectionSort(array);
            
            System.out.println("Sorted array:");
            printArray(array);
        }
    }
    
    /* 
    Explanation:
    selectionSort Method:
    
    Iterates through the array, maintaining a sorted subarray on the left and an unsorted subarray on the right.
    In each iteration, the smallest element from the unsorted subarray is found and swapped with the first element of the unsorted subarray.
    This process is repeated until the entire array is sorted.
    printArray Method:
    
    Prints the elements of the array.
    main Method:
    
    Demonstrates the usage of the selectionSort method by sorting a sample array and printing the array before and after sorting.
 */