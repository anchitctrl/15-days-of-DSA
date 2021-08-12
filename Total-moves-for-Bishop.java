public class Solution {
    static int countSquares(int row, int column)
    {
        int topLeft = Math.min(row, column) - 1;
        int bottomRight = 8 - Math.max(row, column);
        int topRight = Math.min(row, 9 - column) - 1;
        int bottomLeft = 8 - Math.max(row, 9 - column);
        return (topLeft + topRight + bottomRight + bottomLeft);
    }
    public int solve(int A, int B) {
        int count=countSquares(A,B);
        return count;
    }
}
