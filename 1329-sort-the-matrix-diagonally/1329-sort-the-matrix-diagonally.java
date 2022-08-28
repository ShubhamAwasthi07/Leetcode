class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        
        HashMap<Integer,PriorityQueue<Integer>> hm = new HashMap<>();
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++){
                hm.putIfAbsent(i-j, new PriorityQueue<>());
                hm.get(i-j).add(mat[i][j]);
            }
        
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                mat[i][j] = hm.get(i-j).poll();
        
        return mat;
    }
}