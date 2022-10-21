class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.split(" ");
        StringBuilder st = new StringBuilder("");
        for(String x : str){
            st.append(new StringBuilder(x).reverse() + " ");
        }
        return st.toString().trim();
    }
}