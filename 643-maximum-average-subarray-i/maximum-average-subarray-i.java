class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0;
        double avg = -9999.99;
        int right=k;
        while(right<=nums.length){
            int sum=0;
            for(int i=left;i<right;i++){
                sum=sum+nums[i];
            }
            double f=(double)sum/k;
            if(avg<f){
                avg=f;
            }
            left++;
            right++;
        }
        return avg;
    }
}