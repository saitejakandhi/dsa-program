public class RadixSort {
    static void printArray(int arr[]){
    for(int i =0;i < arr.length;i++){
        System.out.print(arr[i] + " ");

            if(i < arr.length){
                System.out.print(" ");
            }
        }
    }
    static int findMax(int arr[]){
        int max = arr[0];
        for(int i = 1;i < arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void countSort(int[] arr,int n,int exp){
        int[] output = new int[n];
        int[] count = new int[10];
        // intalize the count array with zero
        for(int i = 0;i < 10;i++)count[i] = 0;
        // count occurence of each digit
        for(int i = 0;i < n;i++){
            count[(arr[i]/exp)% 10]++;
        }
        // change count[i] so it now contains actual positions
        for(int i  = 1;i < 10;i++){
            count[i] += count[i - 1];
        }
        // we will create output array
        for(int i = n-1;i >=0;i--){
            int digit = (arr[i]/exp)%10;
            output[count[digit]-1] = arr[i];
            count[digit]--;
        }
        // copy output array to arr
        for(int i = 0;i < n;i++){
            arr[i] = output[i];
        }
    }
    static void radixSort(int[] arr){
        int n = arr.length;
        int max = findMax(arr);
        for(int exp = 1;max/exp > 0;exp *=10){
            countSort(arr,n,exp);
        }
    }
    public static void main(String[] args) {
        int arr[] = {81, 109, 225, 98,3};
        System.out.print("array before radix sort:");
        printArray(arr);
        System.out.println();
        radixSort(arr);
        System.out.print("arry after radix sort:");
        printArray(arr);
    }
    
}
