import java.util.*;

public class BucketSort {

    // Function to sort an array using Bucket Sort
    public static void bucketSort(float arr[]) {
        int n = arr.length;                // Number of elements
        if (n <= 0)
            return;                        // If array is empty, do nothing

        // 1. Create empty buckets
        @SuppressWarnings("unchecked")
        List<Float>[] buckets = new ArrayList[n];  // Create n buckets

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();   // Initialize each bucket
        }

        // 2. Put array elements into different buckets
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;    // Find bucket index for each number
            buckets[bucketIndex].add(arr[i]);      // Add number to its bucket
        }

        // 3. Sort each bucket individually
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);          // Sort each bucket
        }

        // 4. Combine all buckets into one array
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (float value : buckets[i]) {
                arr[index++] = value;              // Write sorted numbers back to array
            }
        }
    }

    // Print the array
    public static void printArray(float arr[]) {
        for (float num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main function to test bucket sort
    public static void main(String[] args) {
        float arr[] = { (float)0.42, (float)0.32, (float)0.23, (float)0.52, (float)0.25, (float)0.47, (float)0.51 };
        System.out.println("Original array:");
        printArray(arr);

        bucketSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}