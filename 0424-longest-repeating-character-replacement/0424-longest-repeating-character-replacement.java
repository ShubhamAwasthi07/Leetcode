class Solution {
    public int characterReplacement(String s, int k) {
    
        int[] hm = new int[26];
        int start = 0;
        int count = 0;
        int maxLen = 0;
        
        for(int end = 0 ; end < s.length() ; end++){
            
            hm[s.charAt(end) - 'A']++;
            
            int current = hm[s.charAt(end) - 'A'];
            count = Math.max(count , current);
            
            while(end - start - count + 1 > k){
                hm[s.charAt(start) - 'A']--;
                start++;
            }
            
            maxLen = Math.max(maxLen , end-start+1);
        }
        return maxLen;
        
    }
}