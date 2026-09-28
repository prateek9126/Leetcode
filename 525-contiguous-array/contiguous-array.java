import java.util.*;

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // sum = 0 occurs before the array starts
        map.put(0, -1);

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {

            // Treat 0 as -1 and 1 as +1
            if (nums[i] == 0) {
                sum--;
            } else {
                sum++;
            }

            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLen = Math.max(maxLen, length);
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}