class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            j=Math.max(j,count);
            if(nums[i]==0){
                count=0;
            }
            
        }
        return j;
    }
}