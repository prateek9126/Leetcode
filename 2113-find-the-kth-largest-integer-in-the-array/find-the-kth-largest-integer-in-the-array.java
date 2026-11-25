import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        BigInteger arr[] = new BigInteger[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i] = new BigInteger(nums[i]);
        }
        int count=0;
        Arrays.sort(arr);
        for(int i=arr.length-1;i>=0;i--){
            count++;
            if(count==k){
                String str = String.valueOf(arr[i]);
                return str;
            }
        }
        return "";
    }
}