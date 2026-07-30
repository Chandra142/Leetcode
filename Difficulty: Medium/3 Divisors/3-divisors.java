import java.util.*;

class Solution {

    public List<Integer> threeDivisors(List<Integer> query) {

        int max = 0;
        for (int x : query)
            max = Math.max(max, x);

        int limit = (int) Math.sqrt(max);

        boolean[] prime = new boolean[limit + 1];
        Arrays.fill(prime, true);

        if (limit >= 0) prime[0] = false;
        if (limit >= 1) prime[1] = false;

        for (int i = 2; i * i <= limit; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= limit; j += i)
                    prime[j] = false;
            }
        }

        int[] prefix = new int[limit + 1];
        for (int i = 1; i <= limit; i++) {
            prefix[i] = prefix[i - 1];
            if (prime[i]) prefix[i]++;
        }

        List<Integer> ans = new ArrayList<>();

        for (int n : query) {
            ans.add(prefix[(int) Math.sqrt(n)]);
        }

        return ans;
    }
}