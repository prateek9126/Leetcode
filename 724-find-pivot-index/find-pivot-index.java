class Solution {
    public int pivotIndex(int[] nums) {
        int l=0;
        int t=0;
        for(int i=0;i<nums.length-1;i++){
            t=t+nums[i+1];
        }
        if(l==t){
            return 0;
        }
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                arr[i]=arr[i-1]+nums[i];
            }
            for(int k=i+1;k<nums.length;k++){
                sum=sum+nums[k];
            }
            if(arr[i-1]==sum){
                return i;
            }
            System.out.print(arr[i-1]+" "+sum+"     ");

        }
        return -1;
    }
}