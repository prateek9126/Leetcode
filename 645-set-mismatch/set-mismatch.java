class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int duplicate = 0;
        int missing = 0;

        // 1. Find the duplicate number while adding elements to the set
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                duplicate = nums[i];
            }
            set.add(nums[i]);
        }

        // 2. Check numbers 1 through n to find which one is missing
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{duplicate, missing};
    }
}