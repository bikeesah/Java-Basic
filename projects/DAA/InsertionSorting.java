

public class InsertionSorting {

        // Method to perform insertion sort on an array
        public static void insertionSort(int[] array) {
            int n = array.length;
            for (int i = 1; i < n; ++i) {
                int key = array[i];
                int j = i - 1;
    
                // Move elements of array[0..i-1] that are greater than key
                // to one position ahead of their current position
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j = j - 1;
                }
                array[j + 1] = key;
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
    
        // Main method to test the insertion sort
        public static void main(String[] args) {
            int[] array = {12, 11, 13, 5, 6};
            
            System.out.println("Unsorted array:");
            printArray(array);
    
            insertionSort(array);
            
            System.out.println("Sorted array:");
            printArray(array);
        }
    }
 /*
Explanation:
insertionSort Method:

Iterates through the array starting from the second element.
For each element, it compares it with the previous elements and inserts it into its correct position in the sorted portion of the array.
printArray Method:

Simply prints the elements of the array.
main Method:

Demonstrates the usage of the insertionSort method by sorting a sample array and printing the array before and after sorting.
   
*/
