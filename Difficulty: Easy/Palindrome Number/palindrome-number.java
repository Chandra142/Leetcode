class Solution {
	public boolean isPalindrome(int n) {
		// code here
		// code here
// 		if(n<10 && n>-10){
// 		    return true;
// 		}
		int sum = 0;
		int copy = n;
		
		while (n!=0) {
			int rem = n%10;
			sum = sum*10 + rem;
			n = n/10;
		}
// 		System.out.println(sum+" "+copy);
		return sum == copy;
	}
}
