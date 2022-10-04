class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            if(!s1.isEmpty() && s.charAt(i) == '#'){
                s1.pop();
            }
            else{
                if(s.charAt(i) != '#')
                   s1.push(s.charAt(i));
            }
        }
        for(int i = 0 ; i < t.length() ; i++){
            if(!s2.isEmpty() && t.charAt(i) == '#'){
                s2.pop();
            }
            else{
                if(t.charAt(i) != '#')
                    s2.push(t.charAt(i));
            }
        }
        
        if(s1.equals(s2))
            return true;
        
        return false;
    }
}