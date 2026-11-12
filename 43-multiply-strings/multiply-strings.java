/*class Solution {
    public String multiply(String num1, String num2) {
        int n1=0;
        for(int i=0;i<num1.length();i++){
            char c = num1.charAt(i);
            int k=(int)(c)-'0';
            n1=n1*10+k;
        }

        int n2=0;
        for(int j=0;j<num2.length();j++){
            char p=num2.charAt(j);
            int l=(int)(p)-'0';
            n2=n2*10+l;
        }

        int z=n1*n2;

        String w="";
        while(z>0){
            int q=z%10;
            w=(char)(q+'0')+w;
            z=z/10;
        }
        return w;

    }
}*/

class Solution {
    public String multiply(String num1, String num2) {

        if(num1.equals("0") || num2.equals("0"))
            return "0";

        int n = num1.length();
        int m = num2.length();

        int arr[] = new int[n + m];

        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=0; j--){

                int a = num1.charAt(i)-'0';
                int b = num2.charAt(j)-'0';

                int mul = a*b + arr[i+j+1];

                arr[i+j+1] = mul%10;
                arr[i+j] += mul/10;
            }
        }

        String s="";

        for(int k : arr){
            if(s.length()==0 && k==0)
                continue;

            s += k;
        }

        return s;
    }
}