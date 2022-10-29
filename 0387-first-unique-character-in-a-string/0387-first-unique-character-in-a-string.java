class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();
        Map<Character , Integer> hm = new HashMap<>();
     
        for(int i = 0 ; i < n ; i++){
            hm.put(s.charAt(i) , hm.getOrDefault(s.charAt(i) , 0) + 1);
        }
        for(int i = 0 ; i < n ; i++){
            if(hm.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}