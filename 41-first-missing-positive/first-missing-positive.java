class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> arr = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        for(int i=1;i<=nums.length+1;i++){
            if(!arr.contains(i)){
                return i;
            }
        }
        return 0;
    }
}