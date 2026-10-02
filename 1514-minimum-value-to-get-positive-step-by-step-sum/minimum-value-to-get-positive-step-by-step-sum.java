class Solution {
    public int minStartValue(int[] nums) {
        int o=99;
        int k=nums.length;
        int l=0;
        boolean a=true;
        for(int i=1;i<9999;i++){
            l=i;
            for(int j=0;j<nums.length;j++){
                l=l+nums[j];
                if(l<0 || l==0){
                    a=false;
                    break;
                }
            }
            if(l>=1 && a==true){
                return i;
            }
            a=true;
        }
        return -1;
    }
}