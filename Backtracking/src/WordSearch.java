public class WordSearch {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        for(int r=0;r<m;r++){
            for(int c=0;c<n;c++){
                if(word.charAt(0)==board[r][c]){
                    boolean exists = dfs(board,word,0,r,c,m,n);
                    if(exists){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    private boolean dfs(char[][] board, String word, int wi, int r, int c, int m, int n){
        if(wi==word.length()){
            return true;
        }
        if(r<0 || r>=m || c<0 || c>=n || board[r][c]!=word.charAt(wi) || board[r][c]==' '){
            return false;
        }
        char ch = board[r][c];
        board[r][c]=' ';
        if (dfs(board,word,wi+1,r+1,c,m,n) || dfs(board,word,wi+1,r-1,c,m,n)
                || dfs(board,word,wi+1,r,c+1,m,n) || dfs(board,word,wi+1,r,c-1,m,n)){
            return true;
        }
        board[r][c]=ch;
        return false;
    }
}
