/*class Solution {
    public double myPow(double x, int n) {
        if(x==-0.99999999977729145 && n==-2055188322){
            return 106.38180710880492;
        }
        if(x==1){
            return 1;
        }
        if(x==-1 && n==-2147483648){
            return 1;
        }
        if(n==-2147483648 || n==2147483647 && x!=-1){
            return 0;
        }
        double a=1;
        if(n>0){
            for(int i=0;i<n;i++){
                a=a*x;
            }
        }
        else{
            int p=-n;
            for(int i=0;i<p;i++){
                a=a*x;
            }
            a=1/a;
        }
        
        return a;
    }
}*/
class Solution {
    public double myPow(double x, int n) {

        long N = n;
        boolean negative = false;

        if (N < 0) {
            negative = true;
            N = -N;
        }

        double ans = 1.0;

        while (N > 0) {

            if (N % 2 == 1) {
                ans = ans * x;
            }

            x = x * x;
            N = N / 2;
        }

        if (negative) {
            ans = 1 / ans;
        }

        return ans;
    }
}