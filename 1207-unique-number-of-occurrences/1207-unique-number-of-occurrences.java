class Solution {
    public boolean uniqueOccurrences(int[] arr) {
       HashMap<Integer, Integer> h = new HashMap<>();
       Set<Integer> s = new HashSet<>();
       for(int a : arr)
           h.put(a, h.getOrDefault(a,0)+1);
       boolean flag = true;
       for( Map.Entry<Integer, Integer> e : h.entrySet()){
           if(s.contains(e.getValue()))
              {
                flag = false;
                break;
              }
           else
               s.add(e.getValue());
         }   
       return flag; 
    }
}