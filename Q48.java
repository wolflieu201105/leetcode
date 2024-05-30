class Solution {
    public void rotate(int[][] matrix) {
        int length = matrix.length - 1;
        int last = length;
        int first = 0;
        while (last > length/2) {
            for (int i = 0; i < last - first; i++) {
                int sub = matrix[first][first + i];
                matrix[first][first + i] = matrix[last - i][first];
                matrix[last - i][first] = matrix[last][last - i];
                matrix[last][last - i] = matrix[first + i][last];
                matrix[first + i][last] = sub;
            }
            first++;
            last--;
        }
    }
}