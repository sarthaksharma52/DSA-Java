class Solution {
    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == word.charAt(0) && find(board,word,0,i,j)){
                    return true;
                }
            }
        }
        return false;
    }

    private boolean find(char[][] board , String word , int idx,int i,int j){

        if(idx == word.length()){
            return true;
        }

        if(i<0 || j<0 || i>=board.length || j>=board[0].length || board[i][j] == '$' ){
            return false;
        }

        if(board[i][j] != word.charAt(idx)){
            return false;
        }

        char temp = board[i][j];

        board[i][j] = '$';
        boolean found = find(board,word,idx+1,i+1,j) || find(board,word,idx+1,i-1,j) || find(board,word,idx+1,i,j+1) || find(board,word,idx+1,i,j-1);

        board[i][j] = temp;

        return found;

    }
}