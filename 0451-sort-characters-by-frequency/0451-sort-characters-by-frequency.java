class Solution {
    public String frequencySort(String s) {
        int n = s.length();
        
        Map<Character , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        
         StringBuilder ans = new StringBuilder();
        for(int i = 0 ; i < hm.size(); i++){
            int max = -1;
            Character p = 'a';
            
            for(Character c : hm.keySet()){
                if(hm.get(c) > max){
                    max = hm.get(c);
                     p = c;
                }
            }
            
            for(int j = 0; j < max ; j++){
                ans.append(p);
            
            }
            hm.put(p , 0);
        }
        
        return ans.toString();
    }
}