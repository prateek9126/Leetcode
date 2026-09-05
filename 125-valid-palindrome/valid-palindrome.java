class Solution {
    public boolean isPalindrome(String s) {
        String h=s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int low=0;
        int high=h.length()-1;
        while(low<high){
            if(h.charAt(low)!=(h.charAt(high))){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}