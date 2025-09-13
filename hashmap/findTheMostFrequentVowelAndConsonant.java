class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        int vowelFreq = 0;
        int consFreq = 0;
        
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));

        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            char ch = entry.getKey();
            int freq = entry.getValue();

            if(vowels.contains(ch)){
                vowelFreq = Math.max(vowelFreq,freq);
            }
            else{
                consFreq = Math.max(consFreq,freq);
            }

        }

        return vowelFreq + consFreq;
    }
}