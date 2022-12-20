class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        
        int l1 = s1.length();
        int l2  = s2.length();
        
        if(l1 != l2)
            return false;
       
        if(l1 == 2 || l2 == 2){
            for(int i = 0 ; i < l1 ; i++){
                if(s1.charAt(i) != s2.charAt(i))
                    return false;
            }
        }
        Map<Character , Integer> hm = new HashMap<>();
        
        for(int i = 0 ; i < l1 ; i++){
            hm.put(s1.charAt(i) , hm.getOrDefault(s1.charAt(i) , 0) + 1);
        }
        
        for(int i = 0 ; i < l2 ; i++){
            if(hm.containsKey(s2.charAt(i))){
                hm.put(s2.charAt(i) , hm.get(s2.charAt(i)) + 1);
            }
            else{
                return false;
            }
        }
        
        for(Character c : hm.keySet()){
            if(hm.get(c) % 2 != 0)
                return false;
        }
        
        
        int count = 0;
        for(int i = 0 ; i < l1 ; i++){
            if(s1.charAt(i) != s2.charAt(i)){
                count++;
            } 
        }
        if(count == 2 || count == 0)
            return true;
        
        return false;
    }
}