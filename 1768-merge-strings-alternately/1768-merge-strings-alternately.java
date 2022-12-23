class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        String ans = "";
        
        int l1 = word1.length();
        int l2 = word2.length();
        int i = 0;
        int j = 0;
        while(i != l1 && j != l2){
            ans = ans + word1.charAt(i) + word2.charAt(j);
            i++;
            j++;
        }
        if(i != l1){
            ans = ans + word1.substring(i);
        }
        else{
            ans = ans + word2.substring(j);
        }

        return ans;
    }
}