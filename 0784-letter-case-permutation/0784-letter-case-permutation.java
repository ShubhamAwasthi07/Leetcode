class Solution {
     public List<String> letterCasePermutation(String s) {
        
        List<String> ans=new ArrayList<>();
        permutation(s,0,ans,"");
        
        return ans;
    }
    
    void permutation(String s,int index,List<String> ans,String curr){
        if(index==s.length()){
            ans.add(curr);
            return;
        }
        
        if(s.charAt(index)>='0' && s.charAt(index)<='9'){
            permutation(s,index+1,ans,curr+String.valueOf(s.charAt(index)));
        }
        else{
            permutation(s,index+1,ans,curr+String.valueOf(s.charAt(index)).toLowerCase());
            permutation(s,index+1,ans,curr+String.valueOf(s.charAt(index)).toUpperCase());
            
        }
    }
}