class Solution {
	public:
	int floorSqrt(int n) {
		// code here
		for (int i = 1; i<n; i++) {
			if (i*i > n) {
				return i-1;
			}
		}
	}
};
