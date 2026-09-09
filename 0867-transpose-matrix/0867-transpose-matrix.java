class Solution {
    public int[][] transpose(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int newTotalRows = n;
        int newtotalCols = m;

        int[][] ans = new int[newTotalRows][newtotalCols];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}