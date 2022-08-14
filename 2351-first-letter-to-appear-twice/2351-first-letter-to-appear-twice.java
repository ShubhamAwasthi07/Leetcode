class Solution {
    public char repeatedCharacter(String s) {
        int n = s.length();
        int[] hm = new int[26];
        for(int i = 0 ; i < n ; i++){
            char c = s.charAt(i);
            hm[c - 'a']++;
            
            if(hm[c - 'a'] > 1){
                return c;
            }
        }
        
        return '0';
    }
}