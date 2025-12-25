public class CountingSort {

    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int[] arr) {
        int max = findMax(arr);
        int[] count = new int[max + 1];

        // Count the frequency of each element
        for(int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // Build the sorted array
        int k = 0;
        for(int i = 0; i < count.length; i++) {
            for(int j = 0; j < count[i]; j++) {
                arr[k++] = i; // ✅ fix: write the actual value i, not 1
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 4, 5, 1, 0, 9, 7};

        System.out.println("Array Before Counting Sort:");
        printArray(arr);

        countSort(arr);

        System.out.println("Array After Counting Sort:");
        printArray(arr);
    }
}
