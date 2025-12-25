public class BinarySearch {
    public static int binarysearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] > target){
                high = mid -1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={2,5,7,8,11,19};
        int target = 11;
        int result = binarysearch(arr, target);
        System.out.println(result);
        
    }
    
}
