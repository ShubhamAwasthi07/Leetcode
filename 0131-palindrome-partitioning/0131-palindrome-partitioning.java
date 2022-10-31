class Solution {
    
    public boolean isPalindrome(String s, int low, int high){
       while(low < high)
          if(s.charAt(low++) != s.charAt(high--)) return false;
       return true;
    } 
    
    public void backTrack(List<List<String>> ans , List<String> temp , int start , String s){
        
        if(s.length() == start){
            ans.add(new ArrayList<>(temp));
        }
        
        for(int i = start ; i < s.length() ; i++){
            if(isPalindrome(s , start , i)){
                temp.add(s.substring(start , i + 1));
                backTrack(ans , temp , i + 1 , s);
                temp.remove(temp.size() - 1);
                
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        backTrack(ans , new ArrayList<>() , 0 , s);
        return ans;
    }
}