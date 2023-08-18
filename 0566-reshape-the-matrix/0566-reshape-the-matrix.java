class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row=mat.length;
        int col=mat[0].length;
        int check=row*col;
        int check2=r*c;
        if(check!=check2){
            return mat;
        }
        
        int k=0;
        int l=0;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(l<mat[0].length){
                    arr[i][j]=mat[k][l++];
                }else{
                    k++;
                    l=0;
                    arr[i][j]=mat[k][l++];
                }
            }
        }
        return arr;
    }
}