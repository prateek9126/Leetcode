class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int count=0;
        int sum=0;
        int t=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[r];
            r++;
            count++;
            while(sum>=target){
                t=Math.min(t,count);
                sum=sum-nums[l];
                l++;
                count--;
            }
        }
        if (t == Integer.MAX_VALUE) {
            return 0;
        }
        return t;
    }
}