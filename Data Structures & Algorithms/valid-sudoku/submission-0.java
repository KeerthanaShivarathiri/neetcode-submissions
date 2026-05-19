class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set[] r=new HashSet[9];
        Set[] c=new HashSet[9];
        Set[] b=new HashSet[9];
        for(int i=0;i<9;i++){
            r[i]=new HashSet<>();
            c[i]=new HashSet<>();
            b[i]=new HashSet<>();

        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char v=board[i][j];
                if(v=='.'){
                    continue;
                }
                int bi = (i / 3) * 3 + (j / 3);
                if(!r[i].add(v)){
                    return false;
                }
                if(!c[j].add(v)){
                    return false;
                }
                if(!b[bi].add(v)){
                    return false;
                }
            }
        }
        return true;

    }
}
