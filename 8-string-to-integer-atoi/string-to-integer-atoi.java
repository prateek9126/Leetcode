/*class Solution {
    public int myAtoi(String s) {
        StringBuilder str = new StringBuilder();
        boolean t=true;
        String l="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
                continue;
            }
            l=l+s.charAt(i);
        }
        if(l.charAt(0)=='-'){
            t=false;
        }
        for(int i=1;i<l.length();i++){
            if(l.charAt(i)=='-' || l.charAt(i)=='+'){
                return 0;
            }
        }
        for(int i=0;i<l.length();i++){
            if(l.charAt(i)==' ' || l.charAt(i)=='+' || l.charAt(i)=='-'){
                continue;
            }
            else if(l.charAt(i)>'a' && l.charAt(i)<'z' || l.charAt(i)>'A' && l.charAt(i)<'Z' || l.charAt(i)=='.'){
                break;
            }
            str.append(l.charAt(i));
        }
        int num=0;
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            num = num * 10 + digit;
        }

        if(num<-2147483648){
            return -2147483648;
        }
        if(num>2147483647){
            return 2147483647;
        }
        if(t==false){
            return -num;
        }
        return num;

    }
}*/

class Solution {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check the sign
        int sign = 1;

        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        // 3. Read digits and handle overflow
        long num = 0;

        while (i < n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
            int digit = s.charAt(i) - '0';
            num = num * 10 + digit;

            // 4. Clamp to the 32-bit integer range
            if (sign == 1 && num > 2147483647L) {
                return 2147483647;
            }

            if (sign == -1 && num > 2147483648L) {
                return -2147483648;
            }

            i++;
        }

        return (int) (sign * num);
    }
}