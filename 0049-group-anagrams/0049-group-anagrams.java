class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String , List<String>> hm = new HashMap<>();
        int n = strs.length;
        
        for(int i = 0 ; i < n ; i++){
            
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sortedString = new String(ch);
            
            if(!hm.containsKey(sortedString)){
                hm.put(sortedString , new ArrayList<String>()); 
            }
            hm.get(sortedString).add(strs[i]);
            
        }
        return new ArrayList<>(hm.values());
    }
}