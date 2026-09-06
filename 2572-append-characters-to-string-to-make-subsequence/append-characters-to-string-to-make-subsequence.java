class Solution {
    public int appendCharacters(String s, String t) {
        int c=0;
        int d=0;
        int k=0;
        while(c<s.length() && d<t.length()){
            if(s.charAt(c)==t.charAt(d)){
                d++;
            }
            c++;
        }
        while(d<t.length()){
            k++;
            d++;
        }
        return k;
    }
}