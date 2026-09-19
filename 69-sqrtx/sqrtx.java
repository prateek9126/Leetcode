class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        int t=x;
        /*if(x == 0) {
            return 0;
        }
        int t = x;
        ArrayList<Integer> arr = new ArrayList<>();
        int j = 2;
        while(x > 1 && j <= x / j) {
            if(x % j == 0) {
                arr.add(j);
                x = x / j;
            }
            else {
                j++;
            }
        }
        if(x > 1) {
            arr.add(x);
        }
        int l = 1;
        for(int i = 0; i < arr.size() - 1; i += 2) {

            if(arr.get(i).equals(arr.get(i + 1))) {
                l = l * arr.get(i);
            }
        }*/
        int l=1;
        while((long)(l+1) * (l+1) <= t) {
            l++;
        }
        return l;
    }
}