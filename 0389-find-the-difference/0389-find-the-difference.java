class Solution {
    public char findTheDifference(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        Map<Character , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n1 ; i++){
            hm.put(s.charAt(i) , hm.getOrDefault(s.charAt(i) , 0) + 1);
        }
        
        for(int i = 0 ; i < n2 ; i++){
           if(hm.containsKey(t.charAt(i))){
               hm.put(t.charAt(i) , hm.get(t.charAt(i))-1);
               if(hm.get(t.charAt(i)) <= 0){
                   hm.remove(t.charAt(i));
               }
           }else{
               return t.charAt(i);
           }
        }
        return '0';
    }
}