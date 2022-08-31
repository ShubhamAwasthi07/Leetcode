class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        
        Map<String , ArrayList<String>> hm = new HashMap<>();
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