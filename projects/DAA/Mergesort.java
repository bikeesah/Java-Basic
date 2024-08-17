

public class Mergesort {
    
        // Method to perform merge sort on an array
        public static void mergeSort(int[] array, int left, int right) {
            if (left < right) {
                // Find the middle point
                int mid = (left + right) / 2;
    
                // Sort first and second halves
                mergeSort(array, left, mid);
                mergeSort(array, mid + 1, right);
    
                // Merge the sorted halves
                merge(array, left, mid, right);
            }
        }
    
        // Method to merge two subarrays of array[]
        public static void merge(int[] array, int left, int mid, int right) {
            // Sizes of the two subarrays to be merged
            int n1 = mid - left + 1;
            int n2 = right - mid;
    
            // Temporary arrays
            int[] leftArray = new int[n1];
            int[] rightArray = new int[n2];
    
            // Copy data to temporary arrays
            for (int i = 0; i < n1; ++i)
                leftArray[i] = array[left + i];
            for (int j = 0; j < n2; ++j)
                rightArray[j] = array[mid + 1 + j];
    
            // Initial indexes of first and second subarrays
            int i = 0, j = 0;
    
            // Initial index of merged subarray array
            int k = left;
            while (i < n1 && j < n2) {
                if (leftArray[i] <= rightArray[j]) {
                    array[k] = leftArray[i];
                    i++;
                } else {
                    array[k] = rightArray[j];
                    j++;
                }
                k++;
            }
    
            // Copy remaining elements of leftArray[] if any
            while (i < n1) {
                array[k] = leftArray[i];
                i++;
                k++;
            }
    
            // Copy remaining elements of rightArray[] if any
            while (j < n2) {
                array[k] = rightArray[j];
                j++;
                k++;
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
    
        // Main method to test the merge sort
        public static void main(String[] args) {
            int[] array = {12, 11, 13, 5, 6, 7};
            
            System.out.println("Unsorted array:");
            printArray(array);
    
            mergeSort(array, 0, array.length - 1);
            
            System.out.println("Sorted array:");
            printArray(array);
        }
    }
    

/*
 Explanation:
mergeSort Method:

Recursively divides the array into two halves until each subarray has one element.
Calls the merge method to combine the sorted halves.
merge Method:

Merges two sorted subarrays into one sorted array.
Uses temporary arrays to hold the elements of the subarrays.
Compares elements of the subarrays and places the smaller element into the original array.
Copies any remaining elements from the temporary arrays into the original array.
printArray Method:

Prints the elements of the array.
main Method:

Demonstrates the usage of the mergeSort method by sorting a sample array and printing the array before and after sorting.
 */
