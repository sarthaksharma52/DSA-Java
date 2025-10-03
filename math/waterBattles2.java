class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int drank = 0;
        int empty = 0;

        int full = numBottles;

        while (full > 0) {
            drank += full;
            empty += full;
            full = 0;

            if (empty >= numExchange) {
                empty -= numExchange;
                full += 1;
                numExchange++;
            }
        }

        return drank;
    }
}
