public class InterPolationsearch {
    public static int interpolationsearch(int arr[], int target){
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low <= high){
            int pos = low + ((target - arr[low]) * (high - low)) / (arr[high] - arr[low]);

            if(arr[pos] == target){
                ans = pos;
                break;

            }
            else if(target < arr[pos]){
                high = pos -1;

            }
            else{
                low = pos + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int target = 14;
        int result = interpolationsearch(arr, target);
        System.out.println(result);
    }
}