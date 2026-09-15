/*class Solution {
    public int longestSubstring(String s, int k) {
        char[] arr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        StringBuilder h = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= k) {
                h.append(entry.getKey());
            }
        }
        int t = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (h.toString().contains(String.valueOf(s.charAt(i)))) {
                count++;
            }
            else {
                count = 0;
            }
            t = Math.max(t, count);
        }
        
        return t;
    }
}*/

class Solution {
    public int longestSubstring(String s, int k) {
        if (s.length() < k) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : map.keySet()) {

            if (map.get(c) < k) {
                String[] parts = s.split(String.valueOf(c));
                int ans = 0;
                for (String part : parts) {
                    ans = Math.max(ans, longestSubstring(part, k));
                }

                return ans;
            }
        }
        return s.length();
    }
}