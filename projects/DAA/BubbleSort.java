

public class BubbleSort {

        // Method to perform bubble sort on an array
        public static void bubbleSort(int[] array) {
            int n = array.length;
            boolean swapped;
            for (int i = 0; i < n - 1; i++) {
                swapped = false;
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        // Swap array[j] and array[j + 1]
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        swapped = true;
                    }
                }
                // If no elements were swapped, the array is already sorted
                if (!swapped) break;
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
    
        // Main method to test the bubble sort
        public static void main(String[] args) {
            int[] array = {64, 34, 25, 12, 22, 11, 90};
            
            System.out.println("Unsorted array:");
            printArray(array);
    
            bubbleSort(array);
            
            System.out.println("Sorted array:");
            printArray(array);
        }
    }
    
    /*
Explanation:
bubbleSort Method:

Iterates through the array multiple times.
In each iteration, adjacent elements are compared and swapped if they are in the wrong order.
This process is repeated until no more swaps are needed, indicating the array is sorted.
An optimization is included to stop the algorithm if the array is already sorted before completing all iterations.
printArray Method:

Prints the elements of the array.
main Method:

Demonstrates the usage of the bubbleSort method by sorting a sample array and printing the array before and after sorting. 
    */

