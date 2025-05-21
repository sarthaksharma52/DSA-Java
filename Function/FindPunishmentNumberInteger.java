class Solution {
    public int punishmentNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (punishment(i, i * i, 0)) {
                sum += i * i;
            } 
        }
        return sum;
    }

    private boolean punishment(int target, int square, int currentSum) {
        String s = String.valueOf(square);
        return canPartition(s, target, 0, 0);
    }

    private boolean canPartition(String s, int target, int index, int currentSum) {
        if (index == s.length()) {
            return currentSum == target;
        }
        
        int num = 0;
        for (int j = index; j < s.length(); j++) {
            num = num * 10 + (s.charAt(j) - '0');
            if (canPartition(s, target, j + 1, currentSum + num)) {
                return true;
            }
        }
        return false;
    }
}
