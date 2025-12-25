public class TwoDirection {
    public static int maze(int sr,int sc,int er,int ec){
        // base case
        if(sr > er || sc > ec)return 0;
        if(sr == er || sc == ec)return 1;
        int downwards = maze(sr+1,sc,er,ec);
        int rightway = maze(sr,sc+1,er,ec);
        int totalways = downwards + rightway;
        return totalways;
    }
    public static void main(String[] args) {
        int row = 2;
        int col = 2;
        int count = maze(0,0,row-1,col-1);
        System.out.println(count);
    }
    
}
