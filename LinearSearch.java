public class LinearSearch {
    public static int linearsearch(int[] arr,int target){
        int n = arr.length;
        for(int i = 0; i < n;i++){
            if(arr[i] == target)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6};
        int target = 5;
        int result = linearsearch(arr, target);
        System.out.println(result);
    }
    
}
