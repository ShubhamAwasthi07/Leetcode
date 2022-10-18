class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        String prev = "";
        List<String> ans = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            
            char[] ch = words[i].toCharArray();
            Arrays.sort(ch);
            
            String curr = new String(ch);
              if(!curr.equals(prev)){
                ans.add(words[i]);
                prev=curr;
            }
        }
        return ans;
    }
}