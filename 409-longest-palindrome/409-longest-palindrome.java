class Solution {
    public int longestPalindrome(String s) {
        int n = s.length();
        
        Map<Character , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            hm.put(s.charAt(i) , hm.getOrDefault(s.charAt(i) , 0) + 1);
        }
        
        int result = 0;
        boolean oddValueTaken = false;
        for(Integer count : hm.values()){
            if(count % 2 == 0)
                result += count;
            else{
                if(oddValueTaken){
                    result += count - 1;
                }else{
                    oddValueTaken = true;
                    result += count;
                }
            }
        }
        return result;
    }
}