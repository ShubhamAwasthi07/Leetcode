class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.split(" ");
        String ans = "";
        for(int i = 0 ; i < str.length ; i++){
            StringBuilder st = new StringBuilder(str[i]);
            ans = ans +" " + st.reverse().toString();
        }
        return ans.trim();
    }
}