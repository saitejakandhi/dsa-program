public class CountSort {
    static void printArray(int arr[]){
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]);
            if(i < arr.length){
                System.out.print(" ");
            }
        }
    }
    static int findMax(int[] arr){
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int[] arr){
        int n = arr.length;
        int output[] = new int[n];
        int max = findMax(arr);
        int count[] = new int[max+1];
        for(int i = 0; i < arr.length;i++){
            count[arr[i]]++;
        }
        // make prefix sum array of count array.
        for(int i = 1; i < count.length;i++){
            count[i] += count[i - 1];
        }
        // find the index of each element in the original array
        // in the output array
        for(int i = n-1;i >= 0;i--){
            int idx = count[arr[i]] - 1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        //  copy all the element of output to arr
        for(int i = 0;i < n;i++){
            arr[i] = output[i];
        }

    }
    public static void main(String[] args) {
        int arr[] ={4,3,1,2,5,4,1,5,0,3};
        System.out.print("array before count sort:");
        printArray(arr);
        System.out.println();
        countSort(arr);
        System.out.print("arry after count sort:");
        printArray(arr);
    }
    
}
