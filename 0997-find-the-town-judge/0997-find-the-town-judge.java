class Solution {
    
    public int findJudge(int N, int[][] ts) {
            int[] tr = new int[N +1];
            for (int[] t : ts) {
                tr[t[0]]--;
                tr[t[1]]++;
            }
            for (int i = 1; i <= N; i++) {
                if (tr[i] == N - 1) return i;
            }
            return -1;
        }
}
