
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder st = new StringBuilder(s);
        int sum = 0;

        for (int i = shifts.length - 1; i >= 0; i--) {
            sum = (sum + shifts[i]) % 26;

            char c = s.charAt(i);
            char ch = (char) ('a' + (c - 'a' + sum) % 26);

            st.setCharAt(i, ch);
        }

        return st.toString();
    }
}
