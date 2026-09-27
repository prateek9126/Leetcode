class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] arr = new int[nums.length];
        
        // Prefix product
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = prefix;
            prefix = prefix * nums[i];
        }
        
        // Suffix product
        int suffix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] = arr[i] * suffix;
            suffix = suffix * nums[i];
        }
        
        return arr;
    }
}