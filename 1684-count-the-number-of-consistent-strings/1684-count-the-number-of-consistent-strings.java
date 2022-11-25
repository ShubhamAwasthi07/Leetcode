class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count = words.length;
        int[] store = new int[26];
        for(char ch : allowed.toCharArray()){
            store[ch - 'a']++;
        }
        
        for(String word : words){
            for(char ch : word.toCharArray()){
                if(store[ch - 'a'] <= 0){
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}