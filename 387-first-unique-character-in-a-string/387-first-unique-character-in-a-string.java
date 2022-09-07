class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        int[] hm = new int[26];
        
        for(int i = 0 ; i < n ; i++){
            char ch = s.charAt(i);
            hm[ch - 'a']++;
        }
        
        for(int i = 0 ; i < s.length() ; i++){
            if(hm[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}