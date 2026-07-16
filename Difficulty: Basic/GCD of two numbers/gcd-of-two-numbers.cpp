class Solution {
  public:
    int gcd(int a, int b) {
        while(a%b!=0) {
            int rem=a%b;
            a=b;
            b=rem;
        }
        return b;
        
    }
};
