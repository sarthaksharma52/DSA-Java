class Solution {
    double fractionalKnapsack(int[] values, int[] weights, int W) {
        int n = values.length;
        double[][] arr = new double[n][3];

        for (int i = 0; i < n; i++) {
            arr[i][0] = (double) values[i] / weights[i];  
            arr[i][1] = values[i];                         
            arr[i][2] = weights[i];                        
        }

        // Sort by ratio descending
        java.util.Arrays.sort(arr, (a, b) -> Double.compare(b[0], a[0]));

        double totalValue = 0.0;

        for (int i = 0; i < n && W > 0; i++) {
            double ratio = arr[i][0];
            double value = arr[i][1];
            double weight = arr[i][2];

            if (W >= weight) {
                totalValue += value;
                W -= weight;
            } else {
                totalValue += ratio * W;
                break;
            }
        }

        return Math.round(totalValue * 1e6) / 1e6;
    }
}
