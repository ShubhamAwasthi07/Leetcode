class Solution {
    public String removeDuplicates(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < n ; i++){
            if(st.isEmpty()){
                st.push(s.charAt(i));
            }
            else{
                if(st.peek() == s.charAt(i))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
        }
        StringBuilder str = new StringBuilder();
        while(!st.isEmpty()){
            str = str.append(st.pop());
        }
        str.reverse();
        return str.toString();
    }
}