class Solution {
    static final long MOD = 1000000007;

    private long modPow(long base, long exp) {
        long result = 1;
        base %= MOD;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % MOD;
            }
            base = (base * base) % MOD;
            exp >>= 1;
        }
        return result;
    }

    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2; 
        long oddPositions = n / 2;        

        long ans = (modPow(5, evenPositions) * modPow(4, oddPositions)) % MOD;
        return (int) ans;
    }
}
