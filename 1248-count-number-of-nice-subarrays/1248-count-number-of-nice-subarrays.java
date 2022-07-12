class Solution {
    public int numberOfSubarrays(int[] v, int k) {
        Map<Integer, Integer> m = new HashMap<>();
        int n = v.length;
      int odd = 0;
      for(int i = 0; i < n; i++) {
        if(v[i] % 2 == 1)
          odd++;
        m.put(odd, m.getOrDefault(odd, 0) + 1);
      }

      int ans = 0;
      for(int e : m.keySet()) {
        if(m.containsKey(e - k))
          ans += m.get(e) * m.get(e-k);
      }

      ans += m.getOrDefault(k, 0);
      return ans;
    }
}