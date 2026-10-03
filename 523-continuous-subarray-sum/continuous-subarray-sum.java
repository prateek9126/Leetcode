/*class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2){
            return false;
        }
        int t=0;
        for(int i=0;i<nums.length;i++){
            t+=nums[i];
        }
        int v=t;
        if((v%k)==0){
            return true;
        }
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=arr[i-1]+nums[i];
            if((arr[i]%k)==0){
                return true;
            }
        }
        for(int i=0;i<nums.length-1;i++){
            int sum=0;
            sum=nums[i]+nums[i+1];
            if(sum%k==0){
                return true;
            }
        }
        for(int i=0;i<nums.length-3;i++){
            int sum=0;
            sum=nums[i]+nums[i+1]+nums[i+2]+nums[i+3];
            if(sum%k==0){
                return true;
            }
        }
        return false;
    }
}*/

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int rem = sum % k;

            if (map.containsKey(rem)) {

                if (i - map.get(rem) >= 2) {
                    return true;
                }

            } else {
                map.put(rem, i);
            }
        }

        return false;
    }
}