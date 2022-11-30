class Solution {
    public int longestPalindrome(String s) {
        
        Map<Character , Integer> hm = new HashMap<>();
        
        int n = s.length();
        for(int i = 0 ; i < n ; i++){
            hm.put(s.charAt(i) , hm.getOrDefault(s.charAt(i) , 0) + 1);
        }
        
        int ans = 0;
        boolean isFirstOdd = false;
        
        for(Character key: hm.keySet()){
            
            if(hm.get(key) % 2 == 0)
                ans += hm.get(key);
            
            else{
                if(isFirstOdd == false){
                    
                    ans += hm.get(key);
                    isFirstOdd = true;
                }        
                else
                    ans += hm.get(key) - 1;
            }
        }
        return ans;
    }
}