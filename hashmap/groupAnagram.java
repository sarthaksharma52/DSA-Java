class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<>();
        int n = strs.length;
        boolean[] present = new boolean[n];

        for(int i=0;i<n;i++){
            if(present[i]) continue;

            List<String> ls = new ArrayList<>();
            ls.add(strs[i]);
            present[i] = true;

            for(int j=i+1;j<n;j++){
                if(!present[j] && check(strs[i],strs[j])){
                    ls.add(strs[j]);
                    present[j] = true;
                }
            }
            arr.add(ls);
        }
        return arr;
    }
    private boolean check(String s1, String s2){
        char[] as1 = s1.toCharArray();
        char[] as2 = s2.toCharArray();

        Arrays.sort(as1);
        Arrays.sort(as2);

        return Arrays.equals(as1, as2);
    }
}




// ////////////////optimised approach/////////////////// //

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramGroups = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }
            anagramGroups.get(sortedStr).add(str);
        }
        return new ArrayList<>(anagramGroups.values());
    }
}