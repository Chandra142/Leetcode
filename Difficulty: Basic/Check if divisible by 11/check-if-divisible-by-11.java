class Solution {
	public boolean divisibleBy11(String s) {
		// code here
		int rem = 0;
		for (int i = 0; i<s.length(); i++) {
			rem = (rem*10 + (s.charAt(i)) - '0')%11;
			
		}
		return rem == 0;
	}
};
