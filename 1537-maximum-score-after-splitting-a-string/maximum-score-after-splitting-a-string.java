
class Solution {
    public int maxScore(String s) {
        char arr[] = s.toCharArray();
        int l = 1;
        int r = arr.length;
        int score = 0;
        int count = 0;

        while(l < r) {
            for(int i = 0; i < l; i++) {
                if(arr[i] == '0') {
                    score++;
                }
            }

            for(int i = l; i < r; i++) {
                if(arr[i] == '1') {
                    score++;
                }
            }

            count = Math.max(count, score);
            score = 0;
            l++;
        }

        return count;
    }
}