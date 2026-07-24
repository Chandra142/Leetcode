class Solution {
    static boolean armstrongNumber(int n) {
        int copy=n;
        int count=0;
        while(n > 0){
            int dig = n%10;
            count++;
            n = n/10;
        }
        n=copy;
        int sum=0;
        while(n!=0) {
            sum=sum+(int)Math.pow(n%10, count);
            n/=10;
        }
        return sum==copy;
    }
}