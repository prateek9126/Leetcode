class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int t=0;
        for(int i=0;i<s.length()-1;i++){
            boolean []arr=new boolean[256];
            int count=1;
            for(int j=i;j<s.length();j++){
                if(arr[s.charAt(j)]==true){
                    break;
                }
                arr[s.charAt(j)]=true;
                count++;
            }
            t=Math.max(t,count);
        }
        return t-1;
    }
}























