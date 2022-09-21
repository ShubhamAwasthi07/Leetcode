class Solution {
    HashSet<String> ans = new HashSet();
    public void backTrack(String s , int start , int dot , String ip){
        
        if(ip.length() == s.length() + 3 && ip.charAt(ip.length() - 1) != '.'){
            ans.add(ip);
            return;
            
        }
        
        for(int i = start ; i < s.length() ; i++){
            int len = ip.length();
            int j;
            
            if(dot == 3){
                j = s.length();
            }else{
                j = i+1;
            }
            
            String sub = s.substring(start , j);
            if(isValid(sub)){
                ip += sub;
                
                if(dot < 3){
                    ip += '.';
                }
            }
            backTrack(s , i+1 , dot + 1 , ip);
            ip = ip.substring(0 , len);
        }
    }
    
    public boolean isValid(String s){
        if(s.length() == 0) return false;
        if(s.length() > 3) return false;
        if(s.charAt(0) == '0' && s.length() > 1) return false;
        
        if(Integer.parseInt(s) > 255) return false;
        
        return true;
    }
    public List<String> restoreIpAddresses(String s) {
        
        backTrack(s , 0 , 0 , "");
        return new ArrayList(ans);
    }
    
    
}