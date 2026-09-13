class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int l=0;
        int r=0;
        int sum=0;
        int c=0;
        while(r!=arr.length){
            sum=sum+arr[r];
            r++;
            c++;
            if(c==k){
                int m=sum/k;
                if(m>=threshold){
                    count++;
                }
                sum=sum-arr[l];
                l++;
                c--;
            }
            
        }
        return count;
    }
}