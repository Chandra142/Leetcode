class Solution {
  public:
    int findCeil(vector<int>& arr, int x) {
        // code here
        int start=0;
        int end=arr.size()-1;
        int store=-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=x){
                store=mid;
                end=mid-1;
                
                
            }
            else{
                start=mid+1;
            }
        }
        return store;
        
        //return -1;
    }
};