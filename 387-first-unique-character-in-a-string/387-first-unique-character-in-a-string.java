class Solution {
    public int firstUniqChar(String s) {
        
        char[] hm = new char[26];
        
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            hm[ch - 'a']++;
        }
        for(int i = 0 ; i < s.length() ; i++){
                if(hm[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
    }
}