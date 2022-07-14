class Solution {
    public String removeDuplicates(String str) {
        
        char[] ch = str.toCharArray();
        int n = ch.length;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < n ; i++){
            if(st.empty() == true){
                st.push(ch[i]);
            }else{
                if(ch[i] == st.peek()){
                    st.pop();
                }
                else{
                    st.push(ch[i]);
                }
            }
        }
        StringBuilder t  = new StringBuilder();
        
        while(st.empty() == false){
            t.append(st.pop());
        }
        t.reverse();
        return t.toString();
    }
}