class Solution {
    public int arrangeCoins(int n) {
        int rows = 0;
        int currentRow = 1;

        while (n >= currentRow) {
            n -= currentRow;
            rows++;
            currentRow++;
        }

        return rows;
    }
}
