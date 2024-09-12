class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String str = String.join("",word1);
        String str1 = String.join("",word2);

        boolean ans = str.equals(str1);

        return ans;

    }
}