class Solution {
	public boolean isPalindrome(int n) {
		int sum = 0;
		int copy = n;
		while (n!=0) {
			int rem = n%10;
			sum = sum*10 + rem;
			n = n/10;
		}
		return sum == copy;
	}
}
