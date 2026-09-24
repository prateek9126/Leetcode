class Solution {
    public int thirdMax(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(!arr.contains(nums[i])){
                arr2.add(nums[i]);
            }
            arr.add(nums[i]);
        }
        int arr3[]=new int[arr2.size()];
        for(int i=0;i<arr3.length;i++){
            arr3[i]=arr2.get(i);
        }
        if(arr3.length==1){
            return arr3[0];
        }
        if(arr3.length==2){
            int p=Math.max(arr3[0],arr3[1]);
            return p;
        }
        Arrays.sort(arr3);
        return arr3[arr3.length-3];
    }
}