class Solution {
    public int minimumTotal(List<List<Integer>> t) {
        
        for (int i = t.size() - 2; i >= 0; i--) {
            for (int j = 0; j < t.get(i).size(); j++) {
                int min = Math.min(t.get(i + 1).get(j), t.get(i + 1).get(j + 1));
                int sum = min + t.get(i).get(j);
                t.get(i).set(j, sum);
            }
        }

        return t.get(0).get(0);
    }
}