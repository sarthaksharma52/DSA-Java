class Solution {

    private static final Map<Character,String> ans = new HashMap<>();
    static {
        ans.put('2',"abc");
        ans.put('3',"def");
        ans.put('4',"ghi");
        ans.put('5',"jkl");
        ans.put('6',"mno");
        ans.put('7',"pqrs");
        ans.put('8',"tuv");
        ans.put('9',"wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) return res;

        backtrack(res, new StringBuilder(), digits, 0);
        return res;
    }

    private void backtrack(List<String> res, StringBuilder str, String digits, int index) {
        if (index == digits.length()) {
            res.add(str.toString());
            return;
        }
        String val = ans.get(digits.charAt(index));
        for (char c : val.toCharArray()) {
            str.append(c);
            backtrack(res, str, digits, index + 1);
            str.deleteCharAt(str.length() - 1);
        }
    }
}