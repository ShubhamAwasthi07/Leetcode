class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        
        String ans = "";
        String[] arr = s.split(" +");
        
        for(String x : arr)
            ans = x + ' ' + ans;
            ans = ans.trim();
        
        return ans;
    }
}