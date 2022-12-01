class Solution {
    public boolean halvesAreAlike(String s) {
        
        int n = s.length();
        s = s.toLowerCase();
        System.out.print(s);
        int l = n / 2;
        String s1 = "";
        String s2 = "";
        for(int i = 0 ; i < l ; i++){
            s1 = s1 + s.charAt(i);
        }
        int count1 = 0;
        for(int i = 0 ; i < s1.length() ; i++){
            if(s1.charAt(i) == 'a'|| s1.charAt(i) == 'e' || s1.charAt(i) == 'i'|| s1.charAt(i) == 'o'||s1.charAt(i) == 'u'){
                count1++;
            }
        }
        
        for(int i = l ; i < n ; i++){
            s2 = s2 + s.charAt(i);
        }
         int count2 = 0;
        for(int i = 0 ; i < s2.length() ; i++){
            if(s2.charAt(i) == 'a'|| s2.charAt(i) == 'e' || s2.charAt(i) == 'i'|| s2.charAt(i) == 'o'||s2.charAt(i) == 'u'){
                count2++;
            }
        }
       if(count1 == count2)
           return true;
        
        return false;
    }
}