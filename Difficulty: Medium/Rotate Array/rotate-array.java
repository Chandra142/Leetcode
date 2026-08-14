class Solution {
    public void rotateArr(int arr[], int d) {
        // code here
        d=d%arr.length;
        int[] array = new int[arr.length];
        int idx = 0;
        for(int i = d; i<arr.length;i++){
            array[idx++] = arr[i];
        }
        for(int i = 0; i<d;i++){
            array[idx++] = arr[i];
        }
        for(int i= 0; i<arr.length;i++){
            arr[i] = array[i];
        }
    }
}