class Solution {
	public int digitalRoot(int n) {
		// code here
		if( n>0 && n <10){
		    return n;
		}
		int sum = 0;
		while(n>0){
		    int rem = n%10;
		    sum = sum + rem;
		    n = n/10;
		}
		return digitalRoot(sum);
	}
};
