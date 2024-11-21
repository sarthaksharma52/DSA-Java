class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target); // Work with positive target
        int sum = 0;               // Sum of moves
        int steps = 0;             // Number of moves

        // Keep moving until sum >= target and (sum - target) is even
        while (sum < target || (sum - target) % 2 != 0) {
            steps++;
            sum += steps; // Increment sum by the current step
        }

        return steps;
    }
}
