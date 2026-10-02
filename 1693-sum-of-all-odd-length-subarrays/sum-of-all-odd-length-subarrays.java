class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                ArrayList<Integer> num = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    num.add(arr[k]);
                }
                if(num.size()%2!=0){
                    for(int q=0;q<num.size();q++){
                        sum+=num.get(q);
                    }
                }
            }
        }
        return sum;
    }
}