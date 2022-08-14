class Solution {
    public char findTheDifference(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        Map<Character , Integer> map = new HashMap<>();
       for(int i=0;i<s.length();i++){
int count = 0;
map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
}
for(int i=0;i<t.length();i++){
if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))>0)
map.put(t.charAt(i),map.get(t.charAt(i))-1);
else
return t.charAt(i);

    }
    return ' ';           
}
}