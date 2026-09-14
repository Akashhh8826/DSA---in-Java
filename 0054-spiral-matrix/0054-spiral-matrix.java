class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = m-1;
        int endingCol = n-1;
        List<Integer> list = new ArrayList<>();

        while(startingRow <= endingRow && startingCol <= endingCol){
            // row wise from left to right -> startingCol to endingCol
            for(int col = startingCol; col<=endingCol; col++){
                list.add(matrix[startingRow][col]);
            }
            startingRow++;
            // col wise from top to bottom -> startingRow to endingRow
            for(int row = startingRow; row<=endingRow; row++){
                list.add(matrix[row][endingCol]);
            }
            endingCol--;
            // row wise from right to left -> endingCol to startingCol and check if atleast one row exists 
            if(startingRow <= endingRow){
                for(int col = endingCol; col>=startingCol; col--){
                    list.add(matrix[endingRow][col]);
                }
                endingRow--;
            }
            // col wise from bottom to top -> endingRow to startingRow and check if atleast one col exists
            if(startingCol <= endingCol){
                for(int row = endingRow; row>=startingRow; row--){
                    list.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }
        return list;
    }
}