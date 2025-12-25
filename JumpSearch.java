public class JumpSearch{
    public static int jumpsearch(int arr[], int target){
        int n = arr.length;
        int blocksize = (int)Math.sqrt(n);
        int startindex = 0;
        int endindex = blocksize;
        while(endindex < n && arr[endindex] <= target){
            startindex = endindex;
            endindex += blocksize;
            if(endindex > n){
                endindex = n;
            }
        } 
        int result = -1;
        for(int i = startindex; i<endindex; i++){
            if(arr[i] == target)
            return i;
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2,5,8,11,15,21,35,45,88};
        int target = 21;
        int result = jumpsearch(arr,target);
        System.out.println(result);
    }
}