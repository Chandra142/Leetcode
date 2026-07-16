class Solution {
    static boolean isPerfect(int n) {
        // code here
        // double limit=Math.ceil(Math.sqrt(n));
        int sum = 0;
        // System.out.println(limit);
        for(int i = 1;i*i<=n; i++){
            if(n%i==0){
                sum+=i;
                if(n/i!=n) {
                    sum+=n/i;
                }
            }
            
        }
        return sum==n;
    }
};