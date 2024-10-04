class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0, e = letters.length - 1;
        return find(letters, target, s, e);  // Return the result of the find method
    }

    public static char find(char[] letters, char target, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (letters[m] == target) {
                while (m + 1 < letters.length && letters[m] == letters[m + 1]) {
                    m++;
                }
                return letters[(m + 1) % letters.length];
            }

            else if (letters[m] < target) {
                s = m + 1;
            }

            else {
                e = m - 1;
            }
        }

        return letters[s % letters.length];
    }
}
