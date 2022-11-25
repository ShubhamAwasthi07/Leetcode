class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        Map<String , Integer> hm1 = new HashMap<>();
        Map<String , Integer> hm2 = new HashMap<>();
        int n1 = words1.length;
        int n2 = words2.length;
        
        for(int i = 0 ; i < n1 ; i++){
            hm1.put(words1[i] , hm1.getOrDefault(words1[i] , 0) + 1);
        }
       
        for(int i = 0 ; i < n2 ; i++){
            hm2.put(words2[i] , hm2.getOrDefault(words2[i] , 0) + 1);
        }
        int count = 0;
        for(String w : words1){
            if(hm1.containsKey(w) && hm2.containsKey(w) && hm1.get(w) == 1 && hm2.get(w) == 1){
                count++;
            }
        }
        return count;
    }
}