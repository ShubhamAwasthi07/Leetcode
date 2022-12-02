class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] str = s.split(" ");
        if (str.length != pattern.length()) return false;
        
        Map<Character , String> hm = new HashMap<>();
        Map<String , Boolean> used = new HashMap<>();
        
        for(int i = 0 ; i < pattern.length() ; i++){
            
            char ch = pattern.charAt(i);
            if(!hm.containsKey(ch)){
                
                if(used.containsKey(str[i]) == true){
                    return false;
                }
                else{
                    used.put(str[i] , true);
                    hm.put(ch , str[i]);
                }
            }
            else{
                String mapWith = hm.get(ch);
                if(mapWith.equals(str[i]) == false)
                    return false;
            }
        }
        return true;
    }
}