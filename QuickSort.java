public class QuickSort {

    static void printArray(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr , int st , int end){
        int pivot = arr[st];
        int count = 0;

        for(int i = st + 1; i <= end; i++){
            if(arr[i] <= pivot) count++;
        }

        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);

        int i = st, j = end;

        while(i < pivotIdx && j > pivotIdx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;

            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIdx;
    }

    static void quickSort(int[] arr , int st , int end){
        if(st >= end) return;

        int p = partition(arr, st, end);
        quickSort(arr, st, p - 1);
        quickSort(arr, p + 1, end);
    }

    public static void main(String[] args){
        int[] arr = {4, 3, 1, 5, 9, 7};
        int n = arr.length;

        System.out.println("Array Before QuickSort:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Array After QuickSort:");
        printArray(arr);
    }
}
