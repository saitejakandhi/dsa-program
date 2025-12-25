public class RatinMazeFourDirection {
    public static void maze(int sr, int sc,int er, int ec, String s,boolean[][] isvisited){
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc > ec) return;
        if(isvisited[sr][sc] == true) return;
        if( sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        isvisited[sr][sc] = true;
        // right
        maze(sr, sc+1,er,ec,s+"R",isvisited);
        maze(sr, sc-1,er,ec,s+"L",isvisited);
        maze(sr+1,sc,er,ec,s+"D",isvisited);
        maze(sr-1,sc,er,ec,s+"u",isvisited);
        isvisited[sr][sc] = false;
    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean[][] isvisited = new boolean[row][col];
        maze(0,0,row-1,col-1,"",isvisited);
    }
    
}
