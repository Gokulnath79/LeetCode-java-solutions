/*867. Transpose Matrix

Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],
		[2,5,8],
		[3,6,9]]

Example 2:
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],
		[2,5],
		[3,6]]

Constraints:

m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109*/

class Solution {
    public int[][] transpose(int[][] matrix) {
        int R = matrix.length , C = matrix[0].length;
        int [][] ans = new int[C][R];
        for(int r = 0; r<R; ++r)
            for (int c=0; c<C; ++c){
                ans [c][r]=matrix[r][c];
            }

        return ans;
    }
}