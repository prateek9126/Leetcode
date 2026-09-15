/*class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        if(k==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                count++;
            }
        }
        int l=0,r=0,sum=0;
        while(r<nums.length){
            sum=sum+nums[r];
            r++;
            if(sum==k){
                count++;
            }
            while(sum>=k){
                sum=sum-nums[l];
                l++;
            }
        }
        return count;
    }
}*/
class Solution {
    public int subarraySum(int[] nums, int k) {

        int count = 0;

        int l = 0;

        while (l < nums.length) {

            int r = l;
            int sum = 0;

            while (r < nums.length) {

                sum = sum + nums[r];

                if (sum == k) {
                    count++;
                }

                r++;
            }

            l++;
        }

        return count;
    }
}