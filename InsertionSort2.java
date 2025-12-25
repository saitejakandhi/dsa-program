public class InsertionSort2 {
    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                // swap
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 7, 3, 2, 4};
        System.out.println("Array before insertion sort:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Array after insertion sort:");
        printArray(arr);
    }
}
