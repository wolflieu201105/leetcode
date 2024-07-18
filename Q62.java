class Solution {
    public int uniquePaths(int m, int n) {
        if (m == 1 || n == 1){
            return 1;
        }
        int[][] matrix = new int[n][m];
        for (int i = 1; i < m; i++){
            matrix[0][i] = 1;
        }
        for (int i = 1; i < n; i++){
            matrix[i][0] = 1;
        }
        for (int y = 1; y < n; y++){
            for (int x = 1; x < m; x++){
                matrix[y][x] = matrix[y-1][x] + matrix[y][x-1];
            }
        }
        return matrix[n-1][m-1];
    }
}