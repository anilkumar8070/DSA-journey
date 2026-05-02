class Solution {
    public void setZeroes(int[][] matrix) {
        List<int[]> list = new ArrayList<>();
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[0].length ; j++){
                if(matrix[i][j]==0){
                    list.add(new int[]{i,j});
                }
            }
        }

        for(int i = 0 ; i < list.size() ; i++){
            int r = list.get(i)[0];
            int c = list.get(i)[1];

            for(int m = 0 ; m < matrix[0].length ; m++){
                matrix[r][m] = 0;
            }

            for(int n = 0 ; n < matrix.length ; n++){
                matrix[n][c] = 0;
            }
        }

        
    }
}