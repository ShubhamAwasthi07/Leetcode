class Solution {
    public int maxPower(String s) {
        int ans = 0;
        int cnt = 1;
        
        int i = 0;
        
        while(i < s.length() - 1){
            if(s.charAt(i) == s.charAt(i+1)){
                cnt++;
            }
            else{
                ans = Math.max(ans , cnt);
                cnt = 1;
            }
            i++;
        }
        ans = Math.max(ans , cnt);
        return ans;
    }
}