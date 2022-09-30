class Solution {
    
     private char open(char ch){
        if(ch == ')') return '(';
        else if(ch == ']') return '[';
        else if(ch == '}') return '{';
        
        return ' ';
    }
    
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else {
                if(!st.isEmpty() && st.peek() == open(c))  st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}