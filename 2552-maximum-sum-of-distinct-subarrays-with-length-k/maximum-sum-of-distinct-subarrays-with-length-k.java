class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int l = 0;
        int r = 0;

        long sum = 0;
        long count = 0;

        boolean[] arr = new boolean[100001];

        while (r < nums.length) {
            while (arr[nums[r]] == true) {
                arr[nums[l]] = false;
                sum = sum - nums[l];
                l++;
            }
            arr[nums[r]] = true;
            sum = sum + nums[r];
            r++;
            if (r - l == k) {

                count = Math.max(count, sum);
                arr[nums[l]] = false;
                sum = sum - nums[l];
                l++;
            }
        }

        return count;
    }
}