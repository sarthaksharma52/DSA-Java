class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] populationChange = new int[2051]; 

        for (int[] log : logs) {
            populationChange[log[0]]++;  
            populationChange[log[1]]--;  
        }

        int maxPopulation = 0;  
        int maxYear = 1950;     
        int currentPopulation = 0;
        for (int year = 1950; year <= 2050; year++) {
            currentPopulation += populationChange[year];
            
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxYear = year;
            }
        }

        return maxYear;
    }
}