class Solution {
    public int minimumCardPickup(int[] cards) {
        int ans = Integer.MAX_VALUE;
        
        int n = cards.length;
        Map<Integer ,Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < n ; i++){
            if(!hm.containsKey(cards[i])){
                hm.put(cards[i] , i);
            }
            else{
               ans = Math.min(ans, i - hm.get(cards[i]) + 1);
               hm.put(cards[i] , i);
            }
            
            
        }
        if(ans == Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
    }
    
}

