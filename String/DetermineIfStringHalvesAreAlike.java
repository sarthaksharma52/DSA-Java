class Solution {
    public boolean halvesAreAlike(String s) {
        int mid = s.length() / 2;
        int countF = 0;
        int countS = 0;
        String first = s.substring(0, mid);
        String second = s.substring(mid, s.length());

        for (int i = 0; i < first.length(); i++) {
            if (isVowel(first.charAt(i))) {
                countF++;
            }
            if (isVowel(second.charAt(i))) {
                countS++;
            }
        }
        return countF == countS;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
