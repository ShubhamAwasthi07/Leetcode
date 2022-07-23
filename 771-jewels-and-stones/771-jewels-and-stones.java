class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = jewels.length();
        int m = stones.length();
        int count = 0;
        Map<Character , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            hm.put(jewels.charAt(i) , hm.getOrDefault(jewels.charAt(i) , 0) + 1);
        }
        for(int i = 0 ; i < m ; i++){
            if(hm.containsKey(stones.charAt(i))){
                count++;
                
            }
        }
        return count;
    }
}