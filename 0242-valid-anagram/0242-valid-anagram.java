class Solution {
    public boolean isAnagram(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        if(n1 != n2) return false;
        
        Arrays.sort(a);
        Arrays.sort(b);
        
       for(int i = 0; i < n1 ; i++){
           if(a[i] != b[i])
               return false;
       }
        return true;
    }
}