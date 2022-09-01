class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int n  = s.length();
        Map<Character , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n ; i++){
            hm.put(s.charAt(i) , i);
        }
        
        int max = 0;
        int prev = -1;
        for(int i = 0 ; i < n ; i++){
            max = Math.max(max , hm.get(s.charAt(i)));
            if(max == i){
                ans.add(max - prev);
                prev = max;
            }
        }
        return ans;
    }
}