class Solution {
    static int findCeil(int[] arr, int x) {
        // code here
        int start = 0, end = arr.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]>=x){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid+1;
            }

        }
        return ans;
    }
}

