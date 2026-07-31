class Solution {
    static long kthDigit(int a, int b, int k) {

        long sq = 1;

        for (int i = 0; i < b; i++) {
            sq *= a;
        }

        long rem = 0;

        while (k > 0) {
            rem = sq % 10;
            sq /= 10;
            k--;
        }

        return rem;
    }
}