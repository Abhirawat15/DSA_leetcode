class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
             for(int j=i+1;j<matrix.length;j++){
                    int temp=matrix[i][j];
                    matrix[i][j]=matrix[j][i];
                    matrix[j][i]=temp;
             }
        }
        
        int low=0;
        int hi=matrix.length-1;
        while(low<hi){
            for(int idx=0;idx<matrix.length;idx++){
                int temp=matrix[idx][low];
                matrix[idx][low]=matrix[idx][hi];
                matrix[idx][hi]=temp;
            }
            low++;
            hi--;
        }
        
    }
}