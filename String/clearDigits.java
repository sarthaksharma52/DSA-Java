class Solution {
    public String clearDigits(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0; 
        
        while (i < str.length()) {
            if (Character.isDigit(str.charAt(i))) {
                str.deleteCharAt(i);
                
                int j = i - 1;
                while (j >= 0 && !Character.isLetter(str.charAt(j))) {
                    j--;
                }
                
                if (j >= 0) {
                    str.deleteCharAt(j);
                    i--; 
                }
                
            } else {
                i++;
            }
        }
        
        return str.toString();
    }
}
