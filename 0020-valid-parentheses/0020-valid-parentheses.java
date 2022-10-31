class Solution {
    
    private char open(char c){
        if(c == ')') return '(';
        else if(c == ']') return '[';
        else if(c == '}') return '{';
        
        return ' ';
    }
    public boolean isValid(String s) {
        int n = s.length();
        Stack<Character> st = new Stack<>();
        
        for(int i = 0 ; i < n ; i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                st.push(c);
            }
            else{
                if(!st.isEmpty() && st.peek() == open(c))
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();
    }
}