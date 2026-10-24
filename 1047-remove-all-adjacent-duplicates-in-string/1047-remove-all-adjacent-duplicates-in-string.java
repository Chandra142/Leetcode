class Solution {
    public String removeDuplicates(String s) {
        StringBuilder str = new StringBuilder(s);
        int i = 0;
        int j = 1;
        int n = str.length();
        while( i < str.length() && j < str.length()){
            if( i>=0 && j >=0 && str.charAt(i) == str.charAt(j)){
                str.deleteCharAt(i);
                str.deleteCharAt(i);
                i--;
                j--;
            }
            else{
                i++;
                j++;

            }
        }
        return str.toString();
    }
}