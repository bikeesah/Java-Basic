import java.util.Arrays;

public class sort{
   
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        
        // ascending order
        Arrays.sort(arr);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

    